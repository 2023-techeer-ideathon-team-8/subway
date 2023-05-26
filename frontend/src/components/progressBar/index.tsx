import React, { useState } from "react";
import "./styles.scss";
const ProgressBar = () => {
  function getRandomBoolean() {
    return Math.random() < 0.5;
  }

  return (
    <>
      <div className="subWay-background">
        <div></div>
        <div className="subway-line">
          <ul className="progress-bar">
            <li className={`step ${getRandomBoolean() ? "completed" : ""}`}>
              1
            </li>
            <li className={`step ${getRandomBoolean() ? "completed" : ""}`}>
              2
            </li>
            <li className={`step ${getRandomBoolean() ? "active" : ""}`}>3</li>
            <li className={`step ${getRandomBoolean() ? "completed" : ""}`}>
              4
            </li>
            <li className={`step ${getRandomBoolean() ? "active" : ""}`}>5</li>
          </ul>
        </div>
      </div>
      <div>
        <span>사당</span>
        <span>서울대입구</span>
        <span>사당</span>
        <span>서울대입구</span>
        <span>사당</span>
        <span>서울대입구</span>
      </div>
    </>
  );
};

export default ProgressBar;
