import ShowListItem from "./ShowListItem";
import { useEffect, useState } from "react";
import axios from "axios";
import { Show } from "../../types/types";

function ShowListContent() {
  const [shows, setShows] = useState<Show[]>([
    {
      id: "1",
      title: "2021 성시경 연말 콘서트 <성시경>",
      image: "",
      place: "KSPO DOME",
      startDate: "2021.12.29",
      endDate: "2021.12.31",
    },
    {
      id: "2",
      title: "2022 성시경 연말 콘서트 <성시경>",
      image: "",
      place: "KSPO DOME",
      startDate: "2022.12.29",
      endDate: "2022.12.31",
    },
    {
      id: "3",
      title: "2023 성시경 연말 콘서트 <성시경>",
      image: "",
      place: "KSPO DOME",
      startDate: "2023.12.29",
      endDate: "2023.12.31",
    },
    {
      id: "4",
      title: "2024 성시경 연말 콘서트 <성시경>",
      image: "",
      place: "KSPO DOME",
      startDate: "2024.12.29",
      endDate: "2024.12.31",
    },
    {
      id: "5",
      title: "2023 성시경 연말 콘서트 <성시경>",
      image: "",
      place: "KSPO DOME",
      startDate: "2025.12.29",
      endDate: "2025.12.31",
    },
  ]);

  /*   useEffect(() => {
    const fetchShows = async () => {
      try {
        const response = await axios.get(`/api/show/${id}`);
        setShows(response.data);
      } catch (error) {
        console.error("Error fetching type:", error);
      }
    };

    fetchShows();
  }); */

  return (
    <div className="show-list-content">
      {shows.map((s) => (
        <ShowListItem key={s.id} item={s} />
      ))}
    </div>
  );
}

export default ShowListContent;
