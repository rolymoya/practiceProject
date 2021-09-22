import React, {useState, useEffect} from "react";
import './App.css';
import axios from "axios";
import Navbar from "./components/Navbar";
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';



const Children = () => {

  const fetchChildren = () => {
    axios.get("http://localhost:8083/api/v1/child/getChild/1234").then(res => {
      console.log(res);
    });
  }

useEffect(() => {
  fetchChildren();
}, []);

  return <h1></h1>
};

function App() {
  return (
    <Router>
      <Navbar />
      <Switch>
        <Route path='/' />
      </Switch>
      <Children />
    </Router>
    
  );
}

export default App;
