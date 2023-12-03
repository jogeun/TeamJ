import React, { useState, useEffect } from "react";
import logo from "./logo.svg";
import axios from "axios";
import "./App.css";

function App() {
  const [user, setUser] = useState(null);

  useEffect(() => {
    const fetchUser = async () => {
      try {
        const response = await axios.get("/find/1");
        setUser(response.data);
      } catch (error) {
        console.error("Error fetching user:", error);
      }
    };

    fetchUser();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        {user ? <p>api 테스트 성공</p> : <p>api 테스트 실패</p>}
        {user && (
          <p>
            응답값:{user["userNo"]}, {user["userName"]}
          </p>
        )}
      </header>
    </div>
  );
}

export default App;
