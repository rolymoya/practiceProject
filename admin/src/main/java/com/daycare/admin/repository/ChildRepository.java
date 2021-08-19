package com.daycare.admin.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.daycare.admin.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ChildRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Child save(Child child){
        dynamoDBMapper.save(child);
        return child;
    }

    public Child getChildById(String childId){
        System.out.println("This is the child Id from  the repository class:" + childId);
        return dynamoDBMapper.load(Child.class, childId);
    }

    public String deleteChildById(String childId){
        Child child = dynamoDBMapper.load(Child.class, childId);
        dynamoDBMapper.delete(child);
        return "Child Deleted";
    }

    public String updateChild(String childId, Child child){
        dynamoDBMapper.save(child,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("childId",
                        new ExpectedAttributeValue(
                                new AttributeValue().withS(childId)
                        )));
        return childId;
    }
}
