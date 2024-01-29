import TypeListItem from "../../components/main/TypeListItem";
import { useEffect, useState } from "react";
import axios from "axios";
import { Type } from "../../types/types";

function MainContent() {
  const [types, setTypes] = useState<Type[]>([
    { id: "1", name: "뮤지컬", image: "" },
    { id: "2", name: "콘서트", image: "" },
    { id: "3", name: "스포츠", image: "" },
    { id: "4", name: "연극", image: "" },
    { id: "5", name: "뮤지컬", image: "" },
    { id: "6", name: "콘서트", image: "" },
    { id: "7", name: "스포츠", image: "" },
    { id: "8", name: "연극", image: "" },
  ]);

  /* useEffect(() => {
     const fetchType = async () => {
       try {
         const response = await axios.get("/api/cm/type");
         setData(response.data);
       } catch (error) {
         console.error("Error fetching type:", error);
       }
     };

     fetchType();
  }) */

  return (
    <div className="main-content">
      <div className="banner"></div>
      <div className="type-list">
        {types.map((t) => (
          <TypeListItem key={t.id} item={t} />
        ))}
      </div>
    </div>
  );
}

export default MainContent;
