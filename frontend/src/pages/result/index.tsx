import React, { useState } from "react";
import "./styles.scss";
import ProgressBar from "@/components/progressBar";
const Result = () => {
  const [route, setRoute] = useState("");
  const [inOut, setInOut] = useState("");
  const changeSubWayHandler = (e: React.ChangeEvent<HTMLSelectElement>) => {
    setRoute(e.target.value);
  };
  const changeInOutHandle = (e: React.ChangeEvent<HTMLSelectElement>) => {
    setInOut(e.target.value);
  };
  return (
    <div>
      <div className="Result_selectBox">
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
        <button type="button">찾기</button>
      </div>
      <ProgressBar />
    </div>
  );
};

export default Result;
