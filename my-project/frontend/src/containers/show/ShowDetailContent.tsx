import ShowDetailTab from "./ShowDetailTab";

function ShowDetailContent() {
  return (
    <div className="show-detail-content">
      <div className="title"> 2023 변진섭 전국투어 콘서트 : 변천사 - 고양</div>
      <div className="info">콘서트.120분.초등학생이상 관람가</div>
      <div className="place">KSPO DOME</div>
      <div className="date">2023.12.29~2023.12.31</div>
      <div className="open"> 2023-11-18 (토) 티켓오픈</div>
      <div className="banner"></div>
      <ShowDetailTab />
    </div>
  );
}

export default ShowDetailContent;
