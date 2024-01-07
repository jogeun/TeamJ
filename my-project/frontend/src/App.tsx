import {
  BrowserRouter as Router,
  Route,
  Routes,
  useLocation,
} from "react-router-dom";
import "./App.css";
import Nav from "./components/Nav";
import Main from "./containers/main/MainContainer";
import Seat from "./containers/seat/SeatContainer";

function App() {
  const location = useLocation();
  return (
    <div className="app">
      <Routes>
        <Route path="/" element={<Main />}></Route>
        <Route path="/seat" element={<Seat />}></Route>
      </Routes>
      {!["/seat"].includes(location.pathname) && <Nav />}
    </div>
  );
}

export default App;
