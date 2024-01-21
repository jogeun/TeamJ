import { Link } from "react-router-dom";
function TypeListItem() {
  return (
    <Link to="/show/list">
      <div className="type-list-item">
        <div className="image"></div>
        <div className="title">title</div>
      </div>
    </Link>
  );
}

export default TypeListItem;
