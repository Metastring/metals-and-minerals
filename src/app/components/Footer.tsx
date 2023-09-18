'use client'

import { Box, Container, Flex, Grid, Heading, SimpleGrid, Text } from "@chakra-ui/react"
import Image from "next/image";
import lglogo from "../../../public/lgLogo.png";
import Link from "next/link";

export default function Footer() {
  return (
    <Box bg="#0c0c0c">
      <Container maxW={1300}>
        <SimpleGrid
          textAlign={{ lg: "start", base: "center" }}
          spacing="30px"
          py="60px"
          templateColumns={{ base: "repeat(1, 1fr)", md:'repeat(2, 1fr)', lg: "repeat(4, 1fr)" }}
        >
          <Flex
            flexDirection='column'
            alignItems='center'
          >
            <Heading pb="20px" color="white">
              About Us
            </Heading>
            <Image
              m={{ base: "auto", lg: "0" }}
              src={lglogo}
              alt="Panaverse"
            ></Image>
            <Text pt="15px" pr={{ lg: "40px", base: "0" }} color="gray" maxW='80%'>
              The Future of the Web is Web 3.0, Metaverse, and Edge Computing.
              Metaverse is a movement to spread{" "}
            </Text>
          </Flex>
          <Box>
            <Heading color="white">Useful Links</Heading>
            <Grid pt="40px" color="gray">
              <Link href="/">Home</Link>
              <Link href="/">Syllabus</Link>
              <Link href="/">Explore</Link>
              <Link href="/">About</Link>
              <Link href="/">Contact</Link>
            </Grid>
          </Box>
          <Box>
            <Heading color="white">Follow Us</Heading>
            <Grid pt="40px" color="gray">
              <Link href="/">Facebook</Link>
              <Link href="/">Linkedin</Link>
              <Link href="/">Twitter</Link>
              <Link href="/">Youtube</Link>
              <Link href="/">GitHub</Link>
            </Grid>
          </Box>
          <Box>
            <Heading color="white">Contact Us</Heading>
            <Grid pt="40px" color="gray">
              <Link href="/">+92 123 4567890</Link>
              <Link href="/">abcdefghi@gmail.com</Link>
              <Link href="/">Karachi, Pakistan</Link>
            </Grid>
          </Box>
        </SimpleGrid>
      </Container>
    </Box>
  );
}
