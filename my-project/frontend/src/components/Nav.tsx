import "../styles/Nav.css";
import { Link } from "react-router-dom";

function Nav() {
  return (
    <nav className="nav">
      <ul>
        <li>
          <Link to="/">
            <div className="img"></div>
            <div className="title">HOME</div>
          </Link>
        </li>
        <li>
          <Link to="/">
            {" "}
            <div className="img"></div>
            <div className="title">CATEGORY</div>
          </Link>
        </li>
        <li>
          <Link to="/">
            <div className="img"></div>
            <div className="title">SEARCH</div>
          </Link>
        </li>
        <li>
          <Link to="/">
            {" "}
            <div className="img"></div>
            <div className="title">MY</div>
          </Link>
        </li>
      </ul>
    </nav>
  );
}

export default Nav;
