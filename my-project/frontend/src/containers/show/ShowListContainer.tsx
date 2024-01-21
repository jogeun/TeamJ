import ShowListTop from "./ShowListTop";
import ShowListContent from "./ShowListContent";
import "../../styles/Show.css";

function ShowListContainer() {
  return (
    <div className="show-list-container">
      <ShowListTop />
      <ShowListContent />
    </div>
  );
}

export default ShowListContainer;
