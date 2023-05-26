import { lazy } from "react";
import GlobalLayout from "../pages/_layout";
const MainPage = lazy(() => import("./main"));
const OtherPage = lazy(() => import("./other"));

export const routes = [
  {
    path: "/",
    element: <GlobalLayout />,
    children: [
      { path: "/", element: <MainPage /> },
      { path: "/other", element: <OtherPage /> },
    ],
  },
];

export const pages = [{ route: "/" }];
