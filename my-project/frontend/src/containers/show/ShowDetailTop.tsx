import { ReactComponent as BackIcon } from "../../assets/icons/back.svg";
import { ReactComponent as SearchIcon } from "../../assets/icons/search.svg";

function ShowDetailTop() {
  return (
    <div className="top">
      <div className="show-detail-top">
        <div className="img">
          <BackIcon />
        </div>
        <div className="img">
          <SearchIcon />
        </div>
      </div>
    </div>
  );
}

export default ShowDetailTop;
