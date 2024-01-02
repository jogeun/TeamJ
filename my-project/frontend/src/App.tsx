import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import "./App.css";
import Nav from "./components/Nav";
import Main from "./containers/main/MainContainer";
import Seat from "./containers/seat/SeatContainer";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Main />}></Route>
        <Route path="/seat" element={<Seat />}></Route>
      </Routes>
      <Nav />
    </Router>
  );
}

export default App;
