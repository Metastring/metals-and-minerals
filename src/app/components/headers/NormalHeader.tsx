import { Box, Button, Container, Flex, GridItem, IconButton, Menu, MenuButton, MenuItem, MenuList, SimpleGrid } from "@chakra-ui/react";
import { HamburgerIcon } from "@chakra-ui/icons";
import Image from "next/image";
import slogo from '../../../../public/logo.png'
import Link from "next/link";

export default function Header() {
  return (
    <Box boxShadow="lg">
      <Container maxW={1400}>
        <SimpleGrid
          templateColumns={{ lg: "repeat(3, 1fr)", base: "repeat(3, 1fr)" }}
        >
          <Box pt="20px" display={{ lg: "none", base: "initial" }}>
            <Menu>
              <MenuButton
                as={IconButton}
                aria-label="Options"
                icon={<HamburgerIcon />}
                variant="outline"
                float="left"
              />
              <MenuList>
                <MenuItem>Home</MenuItem>
                <MenuItem>Explore</MenuItem>
                <MenuItem>Settings</MenuItem>
                <MenuItem>About</MenuItem>
                <MenuItem>Contact</MenuItem>
              </MenuList>
            </Menu>
          </Box>
          <GridItem
            display="flex"
            colSpan={{ lg: "2", base: "1" }}
            gap={10}
            justifyContent={{ lg: "initial", base: "center" }}
          >
            <Image src={slogo} alt="panaverse-logo"></Image>
            <Flex
              display={{ lg: "flex", base: "none" }}
              placeItems="center"
              color="black"
              fontSize={18}
              fontWeight="semibold"
              gap={10}
            >
              <Link href="">Home</Link>
              <Link href="">Explore</Link>
              <Link href="">Settings</Link>
              <Link href="">About</Link>
              <Link href="">Contact</Link>
            </Flex>
          </GridItem>

          <GridItem
            display={{ lg: "flex", base: "flex" }}
            flexDirection={{ lg: "initial", base: "column" }}
            alignItems={{ lg: "center", base: "flex-end" }}
            justifyContent={{ lg: "flex-end", base: "center" }}
          >
            <Button size={{ lg: "lg", base: "sm" }} colorScheme="teal">
              Sign In
            </Button>
          </GridItem>
        </SimpleGrid>
      </Container>
    </Box>
  );
}
