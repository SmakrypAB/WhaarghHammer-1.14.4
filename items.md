___
# items: 	

### table of contents:
[**adamantium_ingot**](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium_ingot)

[**adamantium_sword**](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/unfinnished-code/items.md#adamantium-sword)
___
# adamantium ingot 

## HOW TO GET: 
smelt adamantium ore (found in the overworld, the nether and end)

<img src="https://cdn.discordapp.com/attachments/390208204984025088/684100817552408619/unknown.png"> <img src="https://media.discordapp.net/attachments/390208204984025088/684097878666510358/unknown.png"> <img src="https://cdn.discordapp.com/attachments/390208204984025088/684098191255404562/unknown.png">

de-craft adamantium block

<img src="https://cdn.discordapp.com/attachments/390208204984025088/684096612523573269/unknown.png" alt="adamantium ingot crafting">

### item texture:  
[file link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/lists/ItemList.java#L7)


<img src="https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/assets/whaarghhammer/textures/item/adamantium_ingot.png" alt="adamantium ingot" height="30" width="30"/>

### main register: 

[link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/WhaarghHammer.java#L85)
```js
ItemList.adamantium_ingot = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("adamantium_ingot")),
```
### lang file: [link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/resources/assets/whaarghhammer/lang/en_us.json#L2)
```json
"item.whaarghhammer.adamantium_ingot": "adamantium ingot",
```
### recipe [link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/data/whaarghhammer/recipes/tutorial_item_crafting.json)
```json
{
	"type": "minecraft:crafting_shapeless",
	"ingredients": [
		{ "item": "whaarghhammer:tutorial_block" }
	],
	"result": {
		"item": "whaarghhammer:tutorial_item",
		"count": 9
 	}
}
```

## items that use adamantium ingot in crafting:
### tools: 
|  TOOL | INGOTS NEEDED |
| ------------- |:-------------:|
| adamantium sword | 2 INGOTS |
| adamantium axe | 3 INGOTS |
| adamantium hoe | 2 INGOTS |
| adamantium pickaxe | 3 INGOTS |
| adamantium shovel | 1 INGOT |
| total: | 11 INGOTS |
### Power Armor:
| ARMOR PIECE | INGOTS NEEDED |
| ------------- |:-------------:|
| power helmet | 5 INGOTS |
| power chestplate | 8 INGOTS | 
| power leggings | 7 INGOTS  |
| power boots | 4 INGOTS |
| total: | 24 INGOTS |
### Blocks:

adamantium block
|  BLOCK | INGOTS NEEDED |
| ------------- |:-------------:|
| adamantium block | 9 |
| total | 9 |
___
# adamantium sword

## how to get:
place 2 adamantium ingots over a stick in the crafting table

## crafting: 

<img src="https://cdn.discordapp.com/attachments/390208204984025088/684093543366524982/unknown.png" alt="adamantium sword crafting">

### item texture:  
[file link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/41874cc925adf76cfffc23f0f1af09dd814beb78/src/main/java/smakrypsletaren/whaarghhammer/lists/ItemList.java#L7)


<img src="https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/assets/whaarghhammer/textures/item/adamantium_sword.png" alt="adamantium sword" height="30" width="30"/>

### main register:

[link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/445bb9d78873a7919067a13e5e98c70dc85981f3/src/main/java/smakrypsletaren/whaarghhammer/WhaarghHammer.java#L94)

### recipe link

[recipe link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/data/whaarghhammer/recipes/adamantium_sword.json)

```json
{
	"type": "minecraft:crafting_shaped",
	"pattern": [
		"X",
		"X",
		"#"
	],
	"key": {
		"#": {
 			"item": "minecraft:stick"
		},
		"X": {
			"item": "whaarghhammer:adamantium_ingot"
		}
	},
	"result": {
		"item": "whaarghhammer:adamantium_sword"
 	}
}
```

[recipe advancement link](https://github.com/SmakrypAB/WhaarghHammer-1.14.4/blob/master/src/main/resources/data/whaarghhammer/advancements/recipes/misc/tutorial_sword.json)

```json
{
    "parent": "minecraft:recipes/root",
    "rewards": {
        "recipes": [
            "whaarghhammer:tutorial_sword"
        ]
    },
    "criteria": {
        "has_ingot": {
            "trigger": "minecraft:inventory_changed",
            "conditions": {
                "items": [
                    {
                        "item": "whaarghhammer:tutorial_item"
                    }
                ]
            }
        },
        "has_the_recipe": {
            "trigger": "minecraft:recipe_unlocked",
            "conditions": {
                "recipe": "whaarghhammer:tutorial_sword"
            }
        }
    },
    "requirements": [
        [
            "has_ingot",
            "has_the_recipe"
        ]
    ]
}
```

## Atributes:

|  attribute | value |
| ------------- |:-------------:|
| attack damage | 11 |
| attack speed | 10 |
| durability | 1600 |

___

