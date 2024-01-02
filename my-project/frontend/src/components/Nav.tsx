import "../styles/Nav.css";
import { Link } from "react-router-dom";
import { ReactComponent as HouseIcon } from "../assets/icons/house.svg";
import { ReactComponent as MenuIcon } from "../assets/icons/menu.svg";
import { ReactComponent as SearchIcon } from "../assets/icons/search.svg";
import { ReactComponent as MyIcon } from "../assets/icons/my.svg";

function Nav() {
  return (
    <nav className="nav">
      <div className="nav-list">
        <div className="nav-list-item">
          <Link to="/">
            <div className="img">
              <HouseIcon />
            </div>
            <div className="title">HOME</div>
          </Link>
        </div>
        <div className="nav-list-item">
          <Link to="/">
            {" "}
            <div className="img">
              <MenuIcon />
            </div>
            <div className="title">CATEGORY</div>
          </Link>
        </div>
        <div className="nav-list-item">
          <Link to="/">
            <div className="img">
              <SearchIcon />
            </div>
            <div className="title">SEARCH</div>
          </Link>
        </div>
        <div className="nav-list-item">
          <Link to="/">
            {" "}
            <div className="img">
              <MyIcon />
            </div>
            <div className="title">MY</div>
          </Link>
        </div>
      </div>
    </nav>
  );
}

export default Nav;
