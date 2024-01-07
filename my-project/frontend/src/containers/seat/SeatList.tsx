import { ReactComponent as BackIcon } from "../../assets/icons/backward.svg";
import { ReactComponent as PlayIcon } from "../../assets/icons/play.svg";
function SeatList() {
  return (
    <div className="seat-list">
      <div className="seat-list-area">
        <div className="seat-list-top">
          <button className="icon">
            <PlayIcon />
          </button>
          <div className="seat-count">R석:1매, S석:2매</div>
          <button className="icon">
            <BackIcon />
          </button>
        </div>

        <div className="seat-list-item">
          <SeatListItem />
          <SeatListItem />
          <SeatListItem />
        </div>
      </div>
    </div>
  );
}

function SeatListItem() {
  return <p>s석 2층 A구역 6열 7</p>;
}

export default SeatList;
