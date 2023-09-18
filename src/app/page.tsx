"use client";
import React from 'react'
import Header from './components/headers/NormalHeader';
import Footer from "@/app/components/Footer";
import HeaderWithDrawer from "@/app/components/headers/DrawerHeader";

export default function Home() {
  return (
      <>
        <Header />
        <HeaderWithDrawer />
        <Footer />
      </>
  )
}
