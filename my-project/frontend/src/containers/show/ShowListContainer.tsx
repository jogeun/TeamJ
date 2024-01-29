import ShowListTop from "./ShowListTop";
import ShowListContent from "./ShowListContent";
import "../../styles/Show.css";
import { useParams } from "react-router-dom";

function ShowListContainer() {
  const { id } = useParams<{ id: string }>();

  // Assuming you have an 'item' object you want to pass to ShowListTop
  const item = { id: "1", name: "콘서트" }; // Replace this with your actual data

  return (
    <div className="show-list-container">
      <ShowListTop item={item} />
      <ShowListContent />
    </div>
  );
}

export default ShowListContainer;
