import SeatTop from "./SeatTop";
import SeatContent from "./SeatContent";
import "../../styles/Seat.css";

function SeatContainer() {
  return (
    <div className="seat-container">
      <SeatTop />
      <SeatContent />
    </div>
  );
}

export default SeatContainer;
