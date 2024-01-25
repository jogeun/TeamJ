function ShowDetailTab() {
  return (
    <div className="show-detail-tab">
      <div className="tab">
        <div className="tab-item tab1">공연정보</div>
        <div className="tab-item tab2">판매정보</div>
        <div className="tab-item tab3">관람후기/기대평</div>
      </div>
      <div className="tab-content content1">
        <h3>NOTICE</h3>
        <p>
          서울특별시 송파구 올림픽로 424 (방이동 88-2) 올림픽공원서울특별시
          송파구 올림픽로 424 (방이동 88-2) 올림 픽공원서울특별시 송파구
          올림픽로 424 (방이동 88-2) 올림 픽공원
        </p>
        <h3>PLACE</h3>
        <p>서울특별시 송파구 올림픽로 424 (방이동 88-2) 올림픽공원</p>
        <p>02-410-1114 | 홈페이지</p>
      </div>
      {/* 
      <div className="tab-content content2">
        <p>Content for Tab 2 goes here.</p>
      </div>

      <div className="tab-content content3">
        <p>Content for Tab 3 goes here.</p>
      </div> */}
      <div className="drawer">
        <div className="d-item">
          <h3>지도보기</h3>
          <div className="map"></div>
        </div>
        <div className="d-item">
          <h3>오시는 길</h3>
          <div className=""></div>
        </div>
        <div className="d-item">
          <h3>주차안내</h3>
          <div className=""></div>
        </div>
      </div>
    </div>
  );
}

const Tabs = () => {};

const TabItem = () => {};
const TabContent = () => {};

export default ShowDetailTab;
