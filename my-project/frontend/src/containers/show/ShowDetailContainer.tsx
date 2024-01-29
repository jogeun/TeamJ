import ShowDetailTop from "./ShowDetailTop";
import "../../styles/Show.css";
import ShowDetailContent from "./ShowDetailContent";
import ShowDetailBottom from "./ShowDetailBottom";
import { useParams } from "react-router-dom";

function ShowDetailContainer() {
  const { id } = useParams<{ id: string }>();

  // Assuming you have an 'item' object you want to pass to ShowListTop
  const item = { id: "1", name: "콘서트" }; // Replace this with your actual data
  return (
    <div className="show-detail-container">
      <ShowDetailTop />
      <ShowDetailContent />
      <ShowDetailBottom />
    </div>
  );
}

export default ShowDetailContainer;
