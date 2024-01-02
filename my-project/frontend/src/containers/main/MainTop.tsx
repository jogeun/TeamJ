import { ReactComponent as SearchIcon } from "../../assets/icons/search.svg";
function MainTop() {
  return (
    <div className="main-top">
      <div className="logo"></div>
      <div className="search">
        <SearchIcon />
      </div>
    </div>
  );
}

export default MainTop;
