import React, {useState, useEffect} from "react";
import logo from './logo.svg';
import './App.css';
import axios from "axios";



const Children = () => {

  const fetchChildren = () => {
    axios.get().then(res => {
      console.log(res);
    });
  }

useEffect(() => {
  fetchChildren();
}, []);

  return <h1>Hello</h1>
};

function App() {
  return (
    <div className="App">
      <Children />
    </div>
  );
}

export default App;
