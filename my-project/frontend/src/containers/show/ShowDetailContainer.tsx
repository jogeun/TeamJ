import ShowDetailTop from "./ShowDetailTop";
import "../../styles/Show.css";
import ShowDetailContent from "./ShowDetailContent";
import ShowDetailBottom from "./ShowDetailBottom";

function ShowDetailContainer() {
  return (
    <div className="show-detail-container">
      <ShowDetailTop />
      <ShowDetailContent />
      <ShowDetailBottom />
    </div>
  );
}

export default ShowDetailContainer;
