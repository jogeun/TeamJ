import { Link } from "react-router-dom";
import { Show } from "../../types/types";

interface ShowListItemProps {
  item: Show;
}
function ShowListItem({ item }: ShowListItemProps) {
  return (
    <Link to={`/show/detail/${item.id}`}>
      <div className="show-list-item">
        <div className="left">
          <div className="img">{item.image}</div>
        </div>
        <div className="right">
          <div className="badge">단독판매</div>
          <div className="title">{item.title}</div>
          <div className="place">{item.place}</div>
          <div className="date">
            {item.startDate} ~ {item.endDate}
          </div>
        </div>
      </div>
    </Link>
  );
}

export default ShowListItem;
