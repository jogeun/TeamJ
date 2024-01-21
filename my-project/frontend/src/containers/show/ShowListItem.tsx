import { Link } from "react-router-dom";
function ShowListItem() {
  return (
    <Link to="/show/detail">
      <div className="show-list-item">
        <div className="left">
          <div className="img"></div>
        </div>
        <div className="right">
          <div className="badge">단독판매</div>
          <div className="title">2023 성시경 연말 콘서트</div>
          <div className="place">KSPO DOME</div>
          <div className="date">2023.12.29 ~ 2023.12.31</div>
        </div>
      </div>
    </Link>
  );
}

export default ShowListItem;
