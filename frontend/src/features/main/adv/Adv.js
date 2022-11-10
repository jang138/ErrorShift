import YoutubeEmbed from "./YoutubeEmbed";

import "./Adv.css";

function Adv() {
  return (
    <div>
      <div style={{ height: 700 }}>
        <div className="adv-main">
          <p className="adv-title">ErrorShift 영상</p>
          <div className="adv-video">
            <h3>embedId 바꿔주면 됨</h3>
            <YoutubeEmbed embedId="FC9-3388JGY" />
          </div>
        </div>
      </div>
    </div>
  );
}
export default Adv;
