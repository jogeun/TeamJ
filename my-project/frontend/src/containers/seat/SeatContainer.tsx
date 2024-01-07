import SeatTop from "./SeatTop";
import SeatContent from "./SeatContent";
import SeatList from "./SeatList";
import SeatBottom from "./SeatBottom";
import "../../styles/Seat.css";

function SeatContainer() {
  return (
    <div className="seat-container">
      <SeatTop />
      <SeatContent />
      <SeatList />
      <SeatBottom />
    </div>
  );
}

export default SeatContainer;
