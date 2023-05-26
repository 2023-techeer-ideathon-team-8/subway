import { useRoutes } from "react-router-dom";
import { routes } from "./pages/Routes";
import "./reset.scss";
export default function App() {
  const elem = useRoutes(routes);
  return <div>{elem}</div>;
}

//suspense lazy
