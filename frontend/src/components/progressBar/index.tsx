import React, { useState } from "react";
import "./styles.scss";
const ProgressBar = () => {
  return (
    <div className="subWay-background">
      <div className="subway-line">
        <ul className="progress-bar">
          <li className="step completed">1</li>
          <li className="step completed">2</li>
          <li className="step active">3</li>
          <li className="step">4</li>
          <li className="step">5</li>
        </ul>
      </div>
    </div>
  );
};

export default ProgressBar;
