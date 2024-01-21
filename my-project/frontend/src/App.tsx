import {
  BrowserRouter as Router,
  Route,
  Routes,
  useLocation,
} from "react-router-dom";
import "./App.css";
import Nav from "./components/Nav";
import Main from "./containers/main/MainContainer";
import ShowList from "./containers/show/ShowListContainer";
import ShowDetail from "./containers/show/ShowDetailContainer";
import Seat from "./containers/seat/SeatContainer";

function App() {
  const location = useLocation();
  return (
    <div className="app">
      <Routes>
        <Route path="/" element={<Main />}></Route>
        <Route path="/show/list" element={<ShowList />}></Route>
        <Route path="/show/detail" element={<ShowDetail />}></Route>
        <Route path="/seat" element={<Seat />}></Route>
      </Routes>
      {!["/seat", "/show/detail"].includes(location.pathname) && <Nav />}
    </div>
  );
}

export default App;
