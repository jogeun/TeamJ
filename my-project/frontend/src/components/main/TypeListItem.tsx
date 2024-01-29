import { Link } from "react-router-dom";
import { Type } from "../../types/types";

interface TypeListItemProps {
  item: Type;
}

function TypeListItem({ item }: TypeListItemProps) {
  return (
    <Link to={`/show/list/${item.id}`}>
      <div className="type-list-item">
        <div className="image">{item.image}</div>
        <div className="title">{item.name}</div>
      </div>
    </Link>
  );
}

export default TypeListItem;
