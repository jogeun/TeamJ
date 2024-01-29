interface ItemType {
  id: string;
  name: string;
}

interface ShowListTopProps {
  item: ItemType;
}

function ShowListTop({ item }: ShowListTopProps) {
  return (
    <div className="show-list-top">
      <div className="title">{item.name}</div>
    </div>
  );
}

export default ShowListTop;
