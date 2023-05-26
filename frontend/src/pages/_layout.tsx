import Footer from "@/components/footer";
import Nav from "@/components/nav";
import { Suspense } from "react";
import { Outlet } from "react-router-dom";

export default function Layout() {
  return (
    <Suspense fallback={"...loading"}>
      <Nav />
      <Outlet />
      <Footer />
    </Suspense>
  );
}
