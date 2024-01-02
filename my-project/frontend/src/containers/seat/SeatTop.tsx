import { ReactComponent as BackIcon } from "../../assets/icons/back.svg";
import { ReactComponent as RotateIcon } from "../../assets/icons/rotate.svg";

function SeatTop() {
  return (
    <div className="seat-top">
      <button className="icon">
        <BackIcon />
      </button>
      <button className="btn">좌석가격</button>
      <button className="icon">
        <RotateIcon />
      </button>
    </div>
  );
}

export default SeatTop;
