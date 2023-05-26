import React from "react";
import "./styles.scss";
const Main = () => {
  const changeSubWayHandler = (e: React.ChangeEvent<HTMLSelectElement>) => {
    console.log(e.target.value);
  };
  const changeInOutHandle = (e: React.ChangeEvent<HTMLSelectElement>) => {
    console.log(e.target.value);
  };
  return (
    <div className="main_back">
      <div className="main_content">
        <div className="main_title">
          <div>급행</div>
        </div>
        <div className="main_input">
          <div className="main_select">
            <select onChange={changeSubWayHandler} name="languages" id="lang">
              <option value="select">호선</option>
              <option value="1호선">1호선</option>
              <option value="2호선">2호선</option>
              <option value="3호선">3호선</option>
              <option value="4호선">4호선</option>
              <option value="5호선">5호선</option>
              <option value="6호선">6호선</option>
              <option value="7호선">7호선</option>
              <option value="8호선">8호선</option>
            </select>
            <select onChange={changeInOutHandle} name="languages" id="lang">
              <option value="select">내/외</option>
              <option value="내">내</option>
              <option value="외">외</option>
            </select>
          </div>

          <button type="button">찾기</button>
        </div>
      </div>
    </div>
  );
};

export default Main;
