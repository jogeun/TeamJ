import MainTop from "./MainTop";
import MainContent from "./MainContent";
import "../../styles/Main.css";
import Nav from "../../components/Nav";

function MainContainer() {
  return (
    <div className="main">
      <MainTop />
      <MainContent />
      <Nav />
    </div>
  );
}

export default MainContainer;
