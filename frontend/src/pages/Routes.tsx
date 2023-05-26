import { lazy } from "react";
import GlobalLayout from "../pages/_layout";
const MainPage = lazy(() => import("./main/Main"));
const ResultPage = lazy(() => import("./result"));
export const routes = [
  {
    path: "/",
    element: <GlobalLayout />,
    children: [
      { path: "/", element: <MainPage /> },
      {
        path: "/result",
        element: <ResultPage />,
      },
    ],
  },
];

export const pages = [{ route: "/" }];
