import React, {useRef} from "react";
import {
  Drawer,
  DrawerBody,
  DrawerHeader,
  DrawerOverlay,
  DrawerContent,
  DrawerCloseButton,
  IconButton,
  SimpleGrid,
  Grid,
  GridItem,
  Flex,
  Box,
  Container,
  useDisclosure,
  Button,
  Icon,
  Menu,
  MenuButton,
  MenuList,
  MenuItem
} from "@chakra-ui/react";
import { AddIcon, ChevronDownIcon, EditIcon, ExternalLinkIcon, HamburgerIcon, InfoIcon, RepeatIcon } from "@chakra-ui/icons";
import Link from "next/link";
import Image from "next/image";
import slogo from "../../../../public/logo.png";
import { AiFillHome, AiTwotoneSetting } from "react-icons/ai";
import { MdExplore, MdConnectWithoutContact } from "react-icons/md";

export default function HeaderWithDrawer() {
    const { isOpen, onOpen, onClose } = useDisclosure();
    const btnRef = React.useRef();
  return (
    <Box boxShadow="lg">
      <Container maxW={1400}>
        <SimpleGrid
          templateColumns={{ lg: "repeat(3, 1fr)", base: "repeat(3, 1fr)" }}
        >
          <Box pt="20px" display={{ lg: "none", base: "initial" }}>
            <Button
              as={IconButton}
              ref={btnRef}
              onClick={onOpen}
              aria-label="Options"
              icon={<HamburgerIcon />}
              variant="outline"
              background="transparent"
              border="1px solid"
              borderColor="gray.200"
            />
            <Drawer
              isOpen={isOpen}
              placement="left"
              onClose={onClose}
              finalFocusRef={btnRef}
            >
              <DrawerOverlay />
              <DrawerContent>
                {/* <DrawerHeader>Create your account</DrawerHeader> */}
                <Flex boxShadow="lg" alignItems="center">
                  <Image src={slogo} alt="panaverse-logo" w="fit-content" />
                  <DrawerHeader>Metaverse</DrawerHeader>
                  <DrawerCloseButton />
                </Flex>

                <DrawerBody mt={5}>
                  <Flex
                    flexDirection="column"
                    placeItems="center"
                    color="black"
                    fontSize={18}
                    fontWeight="semibold"
                    gap={5}
                  >
                    <SimpleGrid templateColumns="repeat(2, 1fr)" w="100%">
                      <GridItem display="flex" justifyContent="center">
                        <Icon as={AiFillHome} boxSize={8} />
                      </GridItem>
                      <GridItem display="flex" alignItems="center">
                        <Link href="">Home</Link>
                      </GridItem>
                    </SimpleGrid>
                    <SimpleGrid templateColumns="repeat(2, 1fr)" w="100%">
                      <GridItem display="flex" justifyContent="center">
                        <Icon as={AiTwotoneSetting} boxSize={8} />
                      </GridItem>
                      <GridItem display="flex" alignItems="center">
                        <Menu>
                          <MenuButton
                            as={Button}
                            padding="0"
                            borderRadius="0"
                            background="transparent"
                            colorScheme="none"
                            color="black"
                            fontSize={18}
                            fontWeight="semibold"
                          >
                            Settings
                          </MenuButton>
                          <MenuList>
                            <MenuItem icon={<AddIcon />} command="⌘T">
                              New Tab
                            </MenuItem>
                            <MenuItem icon={<ExternalLinkIcon />} command="⌘N">
                              New Window
                            </MenuItem>
                            <MenuItem icon={<RepeatIcon />} command="⌘⇧N">
                              Open Closed Tab
                            </MenuItem>
                            <MenuItem icon={<EditIcon />} command="⌘O">
                              Open File...
                            </MenuItem>
                          </MenuList>
                        </Menu>
                      </GridItem>
                    </SimpleGrid>
                    <SimpleGrid templateColumns="repeat(2, 1fr)" w="100%">
                      <GridItem display="flex" justifyContent="center">
                        <Icon as={MdExplore} boxSize={8} />
                      </GridItem>
                      <GridItem display="flex" alignItems="center">
                        <Menu>
                          <MenuButton
                            as={Button}
                            padding="0"
                            borderRadius="0"
                            background="transparent"
                            colorScheme="none"
                            color="black"
                            fontSize={18}
                            fontWeight="semibold"
                          >
                            Explore
                          </MenuButton>
                          <MenuList>
                            <MenuItem>Download</MenuItem>
                            <MenuItem>Create a Copy</MenuItem>
                            <MenuItem>Mark as Draft</MenuItem>
                            <MenuItem>Delete</MenuItem>
                            <MenuItem>Attend a Workshop</MenuItem>
                          </MenuList>
                        </Menu>
                      </GridItem>
                    </SimpleGrid>
                    <SimpleGrid templateColumns="repeat(2, 1fr)" w="100%">
                      <GridItem display="flex" justifyContent="center">
                        <InfoIcon boxSize={8} />
                      </GridItem>
                      <GridItem display="flex" alignItems="center">
                        <Link href="">About</Link>
                      </GridItem>
                    </SimpleGrid>
                    <SimpleGrid templateColumns="repeat(2, 1fr)" w="100%">
                      <GridItem display="flex" justifyContent="center">
                        <Icon as={MdConnectWithoutContact} boxSize={8} />
                      </GridItem>
                      <GridItem display="flex" alignItems="center">
                        <Link href="">Contact</Link>
                      </GridItem>
                    </SimpleGrid>
                  </Flex>
                </DrawerBody>
              </DrawerContent>
            </Drawer>
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
              <Menu>
                <MenuButton
                  as={Button}
                  padding="0"
                  borderRadius="0"
                  background="transparent"
                  colorScheme="none"
                  color="black"
                  fontSize={18}
                  fontWeight="semibold"
                >
                  Settings
                </MenuButton>
                <MenuList>
                  <MenuItem icon={<AddIcon />} command="⌘T">
                    New Tab
                  </MenuItem>
                  <MenuItem icon={<ExternalLinkIcon />} command="⌘N">
                    New Window
                  </MenuItem>
                  <MenuItem icon={<RepeatIcon />} command="⌘⇧N">
                    Open Closed Tab
                  </MenuItem>
                  <MenuItem icon={<EditIcon />} command="⌘O">
                    Open File...
                  </MenuItem>
                </MenuList>
              </Menu>
              <Menu>
                <MenuButton
                  as={Button}
                  padding="0"
                  borderRadius="0"
                  background="transparent"
                  colorScheme="none"
                  color="black"
                  fontSize={18}
                  fontWeight="semibold"
                >
                  Explore
                </MenuButton>
                <MenuList>
                  <MenuItem>Download</MenuItem>
                  <MenuItem>Create a Copy</MenuItem>
                  <MenuItem>Mark as Draft</MenuItem>
                  <MenuItem>Delete</MenuItem>
                  <MenuItem>Attend a Workshop</MenuItem>
                </MenuList>
              </Menu>
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