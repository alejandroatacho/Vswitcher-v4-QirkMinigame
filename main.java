//tree id 12943 game object




WorldPoint currentPoint = client.getLocalPlayer().getWorldLocation();

if (v.getWalking().nearY(5474, 6) && v.getWalking().nearX(2910, 6) && !v.getInventory().inventoryFull() && v.getWalking().isIdle()) {
		WallObject wallObject = (new WallObjectQuery().idEquals(new int[]{11987}).result(client).nearestTo(client.getLocalPlayer()));
			if (client.getEnergy() <= 7000) {
     v.getInventory().pot(Potion.STAMINA_POTION);
			}
	if (wallObject != null) {
		WorldPoint wallworldpoint = WorldPoint.fromLocal(client, wallObject.getX(), wallObject.getY(), wallObject.getPlane());
		int wallSceneX = wallworldpoint.getX() - client.getBaseX();
		int wallSceneY = wallworldpoint.getY() - client.getBaseY();
			v.invoke("Open","<col=ffff>Gate", 11987, 3, wallSceneX, wallSceneY, false);
   }
}  else if (v.getWalking().nearY(5474, 6) && v.getWalking().nearX(2910, 6) && v.getInventory().inventoryFull()) {
		GameObject gameObject = v.getGameObject().findNearest(12941);
			if (gameObject != null) {
			int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
			int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
			v.invoke("Drink-from","<col=ffff>Fountain", 12941, 3, gameObjectSceneX, gameObjectSceneY, false);
			}
}



if (v.getWalking().nearY(5481, 0) && v.getWalking().nearX(2910, 0)) {
	GameObject gameObject = v.getGameObject().findNearest(12943);
			if (gameObject != null) {
			int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
			int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
			v.invoke("Pick-Fruit","<col=ffff>Sq'irk tree", 12943, 3, gameObjectSceneX, gameObjectSceneY, false);
			}
}


if (v.getWalking().nearY(3141, 6) && v.getWalking().nearX(3321, 6) && v.getInventory().inventoryFull()) {
		GameObject gameObject = v.getGameObject().findNearest(2693);
			if (gameObject != null) {
			int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
			int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
			v.invoke("USE","<col=ffff>BANK CHEST", 2693, 3, gameObjectSceneX, gameObjectSceneY, false);
			}
} 


int stampot = 12625;
WorldPoint wp2 = new WorldPoint(3321, 3138, 0); //L2


if ( v.getBank().isOpen() && v.getInventory().inventoryFull()) {
   v.getBank().depositAll();
   v.getCallbacks().afterTicks(1, () -> {
   	v.getBank().withdraw(stampot,3);
   }); 
   v.getCallbacks().afterTicks(5, () -> {
			v.getBank().close();
   }); 	
		v.getCallbacks().afterTicks(7, () -> {
 	  v.getWalking().walk(wp2);
   }); 		
}

if (v.getWalking().nearY(3141, 6) && v.getWalking().nearX(3321, 6) && !v.getInventory().inventoryFull()) {
		v.invoke("teleport","<col=ffff>Apprentice",16498,12,0,0,false);
}