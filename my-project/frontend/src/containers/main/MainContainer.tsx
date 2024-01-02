import MainTop from "./MainTop";
import MainContent from "./MainContent";
import "../../styles/Main.css";
import MainRanking from "./MainRanking";

function MainContainer() {
  return (
    <div className="main">
      <MainTop />
      <MainContent />
      {/* <MainRanking /> */}
    </div>
  );
}

export default MainContainer;
