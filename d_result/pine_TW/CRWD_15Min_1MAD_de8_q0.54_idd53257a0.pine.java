//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: CRWD_15Min_1MAD_d53257a0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_1MAD_d53257a0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_d53257a0(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma15_colorInt <= 3.5 )
		if( ma05_colorInt <= 1.5 )
			if( ma05 <= 342.729 )
				if( ma20 <= 333.326 )
					if( ma80 <= 327.854 )
						if( ma100 <= 46.7352 )
							if( ma20 <= 46.9825 )
								if( ma85 <= 37.6976 )
									ret := -0.272727
								if( ma85 > 37.6976 )
									ret := 0.310811
							if( ma20 > 46.9825 )
								if( ma85 <= 43.9022 )
									ret := -0.666667
								if( ma85 > 43.9022 )
									ret := -0.982456 // sell
						if( ma100 > 46.7352 )
							if( ma70 <= 48.4157 )
								if( ma90_colorInt <= 3.5 )
									ret := 0.911765 // buy
								if( ma90_colorInt > 3.5 )
									ret := 0.037037
							if( ma70 > 48.4157 )
								if( ma15 <= 50.5853 )
									ret := -0.407258
								if( ma15 > 50.5853 )
									ret := 0.013562
					if( ma80 > 327.854 )
						if( ma40 <= 330.736 )
							if( ma80 <= 328.666 )
								if( ma20 <= 329.788 )
									ret := -1.000000 // sell
								if( ma20 > 329.788 )
									ret := -0.277778
							if( ma80 > 328.666 )
								ret := -1.000000 // sell
						if( ma40 > 330.736 )
							if( ma65 <= 331.191 )
								ret := 0.000000
							if( ma65 > 331.191 )
								if( ma45 <= 332.361 )
									ret := -0.750000 // sell
								if( ma45 > 332.361 )
									ret := 0.000000
				if( ma20 > 333.326 )
					if( ma05 <= 338.671 )
						if( ma90 <= 327.635 )
							ret := 0.666667
						if( ma90 > 327.635 )
							ret := 1.000000 // buy
					if( ma05 > 338.671 )
						if( ma80 <= 339.595 )
							if( ma30 <= 340.668 )
								if( ma30_colorInt <= 1.5 )
									ret := 0.233333
								if( ma30_colorInt > 1.5 )
									ret := 1.000000 // buy
							if( ma30 > 340.668 )
								if( ma45 <= 341.437 )
									ret := 0.000000
								if( ma45 > 341.437 )
									ret := -0.250000
						if( ma80 > 339.595 )
							if( ma10 <= 341.465 )
								ret := 1.000000 // buy
							if( ma10 > 341.465 )
								ret := 0.400000
			if( ma05 > 342.729 )
				if( ma90 <= 339.756 )
					if( ma25 <= 343.03 )
						if( ma20 <= 341.444 )
							if( ma55 <= 334.456 )
								ret := -1.000000 // sell
							if( ma55 > 334.456 )
								ret := -0.750000 // sell
						if( ma20 > 341.444 )
							if( ma60 <= 336.691 )
								ret := 0.250000
							if( ma60 > 336.691 )
								if( ma05 <= 344.471 )
									ret := -0.125000
								if( ma05 > 344.471 )
									ret := -1.000000 // sell
					if( ma25 > 343.03 )
						ret := -1.000000 // sell
				if( ma90 > 339.756 )
					if( ma25 <= 389.087 )
						if( ma15_colorInt <= 1.5 )
							if( ma70 <= 373.575 )
								if( ma50 <= 345.527 )
									ret := 0.160714
								if( ma50 > 345.527 )
									ret := -0.392593
							if( ma70 > 373.575 )
								if( ma05 <= 384.674 )
									ret := 0.473684
								if( ma05 > 384.674 )
									ret := -0.179487
						if( ma15_colorInt > 1.5 )
							if( ma90 <= 349.262 )
								ret := -0.200000
							if( ma90 > 349.262 )
								if( ma45 <= 374.32 )
									ret := 1.000000 // buy
								if( ma45 > 374.32 )
									ret := 0.333333
					if( ma25 > 389.087 )
						if( ma10 <= 390.221 )
							if( ma100 <= 387.781 )
								ret := -0.500000
							if( ma100 > 387.781 )
								ret := 0.000000
						if( ma10 > 390.221 )
							if( ma05 <= 391.032 )
								if( ma05 <= 390.585 )
									ret := -0.375000
								if( ma05 > 390.585 )
									ret := -0.884615 // sell
							if( ma05 > 391.032 )
								if( ma10 <= 391.488 )
									ret := -0.076923
								if( ma10 > 391.488 )
									ret := -1.000000 // sell
		if( ma05_colorInt > 1.5 )
			if( ma100 <= 103.431 )
				if( ma30 <= 100.297 )
					if( ma90_colorInt <= 2.5 )
						if( ma55 <= 49.0245 )
							if( ma05_colorInt <= 3.5 )
								if( ma90 <= 37.8436 )
									ret := 0.230769
								if( ma90 > 37.8436 )
									ret := 0.807947 // buy
							if( ma05_colorInt > 3.5 )
								ret := -0.571429
						if( ma55 > 49.0245 )
							if( ma05 <= 94.3804 )
								if( ma85 <= 92.9996 )
									ret := 0.191047
								if( ma85 > 92.9996 )
									ret := 0.751634 // buy
							if( ma05 > 94.3804 )
								if( ma20 <= 96.996 )
									ret := -0.206897
								if( ma20 > 96.996 )
									ret := 0.179811
					if( ma90_colorInt > 2.5 )
						if( ma80 <= 82.1771 )
							if( ma20 <= 79.0853 )
								if( ma40 <= 38.4877 )
									ret := 0.431373
								if( ma40 > 38.4877 )
									ret := 0.047457
							if( ma20 > 79.0853 )
								if( ma85_colorInt <= 3.5 )
									ret := -1.000000 // sell
								if( ma85_colorInt > 3.5 )
									ret := -0.250000
						if( ma80 > 82.1771 )
							if( ma55 <= 85.9507 )
								if( ma90 <= 86.0042 )
									ret := 0.396739
								if( ma90 > 86.0042 )
									ret := 0.927711 // buy
							if( ma55 > 85.9507 )
								if( ma100 <= 87.7648 )
									ret := -0.826923 // sell
								if( ma100 > 87.7648 )
									ret := 0.209016
				if( ma30 > 100.297 )
					if( ma100 <= 101.784 )
						if( ma20_colorInt <= 1.5 )
							if( ma100 <= 100.909 )
								if( ma05 <= 100.948 )
									ret := 1.000000 // buy
								if( ma05 > 100.948 )
									ret := 0.000000
							if( ma100 > 100.909 )
								if( ma05 <= 103.137 )
									ret := 0.904762 // buy
								if( ma05 > 103.137 )
									ret := -0.166667
						if( ma20_colorInt > 1.5 )
							if( ma20 <= 100.449 )
								if( ma100 <= 101.386 )
									ret := 0.000000
								if( ma100 > 101.386 )
									ret := 0.666667
							if( ma20 > 100.449 )
								if( ma60 <= 101.091 )
									ret := 0.907692 // buy
								if( ma60 > 101.091 )
									ret := 0.662338
					if( ma100 > 101.784 )
						if( ma05 <= 99.4953 )
							if( ma15 <= 100.278 )
								if( ma70 <= 102.471 )
									ret := 1.000000 // buy
								if( ma70 > 102.471 )
									ret := 0.800000 // buy
							if( ma15 > 100.278 )
								ret := 0.000000
						if( ma05 > 99.4953 )
							if( ma60 <= 104.071 )
								if( ma25 <= 101.439 )
									ret := -0.015385
								if( ma25 > 101.439 )
									ret := 0.383495
							if( ma60 > 104.071 )
								if( ma65 <= 103.942 )
									ret := -1.000000 // sell
								if( ma65 > 103.942 )
									ret := -0.250000
			if( ma100 > 103.431 )
				if( ma75 <= 105.24 )
					if( ma70 <= 104.362 )
						if( ma90 <= 103.513 )
							if( ma85 <= 103.122 )
								if( ma75 <= 102.518 )
									ret := -0.500000
								if( ma75 > 102.518 )
									ret := 0.250000
							if( ma85 > 103.122 )
								if( ma90 <= 103.403 )
									ret := -1.000000 // sell
								if( ma90 > 103.403 )
									ret := -0.772727 // sell
						if( ma90 > 103.513 )
							if( ma10 <= 102.417 )
								if( ma25 <= 100.835 )
									ret := 1.000000 // buy
								if( ma25 > 100.835 )
									ret := -0.246377
							if( ma10 > 102.417 )
								if( ma25 <= 103.307 )
									ret := 0.833333 // buy
								if( ma25 > 103.307 )
									ret := 0.174757
					if( ma70 > 104.362 )
						if( ma40 <= 105.088 )
							if( ma10 <= 102.426 )
								if( ma05 <= 101.726 )
									ret := 0.000000
								if( ma05 > 101.726 )
									ret := 0.750000 // buy
							if( ma10 > 102.426 )
								if( ma75 <= 104.785 )
									ret := -0.482759
								if( ma75 > 104.785 )
									ret := -0.809524 // sell
						if( ma40 > 105.088 )
							if( ma35 <= 105.843 )
								if( ma100 <= 104.665 )
									ret := 0.214286
								if( ma100 > 104.665 )
									ret := -0.350000
							if( ma35 > 105.843 )
								if( ma20 <= 107.629 )
									ret := -0.687500
								if( ma20 > 107.629 )
									ret := 1.000000 // buy
				if( ma75 > 105.24 )
					if( ma20 <= 318.352 )
						if( ma65 <= 317.589 )
							if( ma35_colorInt <= 2.5 )
								if( ma05 <= 111.904 )
									ret := 0.502203
								if( ma05 > 111.904 )
									ret := 0.104893
							if( ma35_colorInt > 2.5 )
								if( ma25 <= 104.371 )
									ret := 0.666667
								if( ma25 > 104.371 )
									ret := 0.049280
						if( ma65 > 317.589 )
							if( ma100 <= 329.316 )
								if( ma100 <= 319.288 )
									ret := 0.824561 // buy
								if( ma100 > 319.288 )
									ret := 0.310000
							if( ma100 > 329.316 )
								ret := 1.000000 // buy
					if( ma20 > 318.352 )
						if( ma20 <= 340.455 )
							if( ma85 <= 341.4 )
								if( ma25 <= 319.822 )
									ret := -0.351351
								if( ma25 > 319.822 )
									ret := -0.094614
							if( ma85 > 341.4 )
								if( ma05 <= 328.249 )
									ret := -0.972222 // sell
								if( ma05 > 328.249 )
									ret := -0.500000
						if( ma20 > 340.455 )
							if( ma30 <= 341.38 )
								if( ma35_colorInt <= 1.5 )
									ret := 0.200000
								if( ma35_colorInt > 1.5 )
									ret := 0.871795 // buy
							if( ma30 > 341.38 )
								if( ma10 <= 338.909 )
									ret := -1.000000 // sell
								if( ma10 > 338.909 )
									ret := 0.039046
	if( ma15_colorInt > 3.5 )
		if( ma35_colorInt <= 3.5 )
			if( ma90 <= 260.147 )
				if( ma100 <= 48.6034 )
					if( ma100 <= 47.8213 )
						if( ma10_colorInt <= 3.5 )
							ret := -1.000000 // sell
						if( ma10_colorInt > 3.5 )
							if( ma25 <= 45.7629 )
								if( ma05 <= 45.4373 )
									ret := 0.058824
								if( ma05 > 45.4373 )
									ret := 0.888889 // buy
							if( ma25 > 45.7629 )
								if( ma05 <= 45.87 )
									ret := -0.875000 // sell
								if( ma05 > 45.87 )
									ret := 0.000000
					if( ma100 > 47.8213 )
						if( ma100 <= 48.4155 )
							ret := 1.000000 // buy
						if( ma100 > 48.4155 )
							if( ma70 <= 48.3682 )
								if( ma90 <= 48.3205 )
									ret := 0.600000
								if( ma90 > 48.3205 )
									ret := -0.444444
							if( ma70 > 48.3682 )
								ret := 1.000000 // buy
				if( ma100 > 48.6034 )
					if( ma45 <= 52.8734 )
						if( ma90 <= 49.5534 )
							if( ma45 <= 48.1696 )
								if( ma05 <= 47.4837 )
									ret := -0.625000
								if( ma05 > 47.4837 )
									ret := -1.000000 // sell
							if( ma45 > 48.1696 )
								if( ma10 <= 48.5423 )
									ret := 0.000000
								if( ma10 > 48.5423 )
									ret := 0.350000
						if( ma90 > 49.5534 )
							if( ma05 <= 47.703 )
								ret := 0.000000
							if( ma05 > 47.703 )
								if( ma10 <= 50.1832 )
									ret := -0.724138 // sell
								if( ma10 > 50.1832 )
									ret := -1.000000 // sell
					if( ma45 > 52.8734 )
						if( ma15 <= 56.7295 )
							if( ma05 <= 56.0898 )
								if( ma05 <= 54.7303 )
									ret := 0.425532
								if( ma05 > 54.7303 )
									ret := -0.333333
							if( ma05 > 56.0898 )
								if( ma10 <= 56.2868 )
									ret := 0.800000 // buy
								if( ma10 > 56.2868 )
									ret := 1.000000 // buy
						if( ma15 > 56.7295 )
							if( ma30_colorInt <= 3.5 )
								if( ma50 <= 58.6321 )
									ret := -0.750000 // sell
								if( ma50 > 58.6321 )
									ret := -0.084193
							if( ma30_colorInt > 3.5 )
								if( ma15 <= 253.709 )
									ret := -0.235294
								if( ma15 > 253.709 )
									ret := -0.920000 // sell
			if( ma90 > 260.147 )
				if( ma30 <= 348.077 )
					if( ma70 <= 328.909 )
						if( ma65 <= 324.424 )
							if( ma90 <= 324.42 )
								if( ma45 <= 266.031 )
									ret := 0.266667
								if( ma45 > 266.031 )
									ret := 0.077193
							if( ma90 > 324.42 )
								if( ma70 <= 324.177 )
									ret := 1.000000 // buy
								if( ma70 > 324.177 )
									ret := 0.250000
						if( ma65 > 324.424 )
							if( ma35 <= 322.424 )
								ret := -1.000000 // sell
							if( ma35 > 322.424 )
								if( ma25_colorInt <= 3.5 )
									ret := -0.750000 // sell
								if( ma25_colorInt > 3.5 )
									ret := 0.000000
					if( ma70 > 328.909 )
						if( ma70_colorInt <= 2.5 )
							if( ma40 <= 333.588 )
								if( ma80 <= 330.631 )
									ret := -0.250000
								if( ma80 > 330.631 )
									ret := -0.200000
							if( ma40 > 333.588 )
								if( ma60 <= 341.715 )
									ret := 0.250000
								if( ma60 > 341.715 )
									ret := 0.000000
						if( ma70_colorInt > 2.5 )
							if( ma25 <= 323.564 )
								ret := 0.000000
							if( ma25 > 323.564 )
								if( ma90 <= 346.144 )
									ret := 1.000000 // buy
								if( ma90 > 346.144 )
									ret := 0.250000
				if( ma30 > 348.077 )
					if( ma60 <= 360.563 )
						if( ma20 <= 350.374 )
							if( ma30 <= 348.406 )
								ret := -1.000000 // sell
							if( ma30 > 348.406 )
								ret := -0.200000
						if( ma20 > 350.374 )
							ret := -1.000000 // sell
					if( ma60 > 360.563 )
						if( ma65_colorInt <= 1.5 )
							ret := -0.800000 // sell
						if( ma65_colorInt > 1.5 )
							if( ma10 <= 374.011 )
								if( ma15 <= 373.697 )
									ret := 0.000000
								if( ma15 > 373.697 )
									ret := 1.000000 // buy
							if( ma10 > 374.011 )
								if( ma75 <= 385.632 )
									ret := -0.200000
								if( ma75 > 385.632 )
									ret := 0.000000
		if( ma35_colorInt > 3.5 )
			if( ma65 <= 173.559 )
				if( ma40 <= 135.031 )
					if( ma50 <= 131.677 )
						if( ma40 <= 34.2191 )
							ret := 1.000000 // buy
						if( ma40 > 34.2191 )
							if( ma40 <= 34.662 )
								if( ma85 <= 35.213 )
									ret := -0.750000 // sell
								if( ma85 > 35.213 )
									ret := -1.000000 // sell
							if( ma40 > 34.662 )
								if( ma45 <= 38.3107 )
									ret := 0.821429 // buy
								if( ma45 > 38.3107 )
									ret := -0.000414
					if( ma50 > 131.677 )
						if( ma05 <= 135.197 )
							if( ma15 <= 132.417 )
								if( ma55 <= 132.1 )
									ret := -0.333333
								if( ma55 > 132.1 )
									ret := -0.833333 // sell
							if( ma15 > 132.417 )
								if( ma85 <= 136.39 )
									ret := -0.037037
								if( ma85 > 136.39 )
									ret := -1.000000 // sell
						if( ma05 > 135.197 )
							if( ma50 <= 134.929 )
								ret := -0.750000 // sell
							if( ma50 > 134.929 )
								ret := -1.000000 // sell
				if( ma40 > 135.031 )
					if( ma55_colorInt <= 3.5 )
						if( ma10 <= 145.28 )
							if( ma10 <= 143.225 )
								if( ma90 <= 143.516 )
									ret := 0.343750
								if( ma90 > 143.516 )
									ret := -0.640000
							if( ma10 > 143.225 )
								if( ma75 <= 148.281 )
									ret := 0.344828
								if( ma75 > 148.281 )
									ret := 1.000000 // buy
						if( ma10 > 145.28 )
							if( ma75 <= 156.716 )
								if( ma30 <= 153.665 )
									ret := -0.258824
								if( ma30 > 153.665 )
									ret := -1.000000 // sell
							if( ma75 > 156.716 )
								if( ma15 <= 155.28 )
									ret := 0.818182 // buy
								if( ma15 > 155.28 )
									ret := -0.144231
					if( ma55_colorInt > 3.5 )
						if( ma85 <= 141.145 )
							if( ma60 <= 139.296 )
								if( ma65 <= 136.726 )
									ret := 0.384615
								if( ma65 > 136.726 )
									ret := -0.250000
							if( ma60 > 139.296 )
								if( ma80 <= 140.793 )
									ret := 1.000000 // buy
								if( ma80 > 140.793 )
									ret := 0.909091 // buy
						if( ma85 > 141.145 )
							if( ma40 <= 140.042 )
								if( ma35 <= 138.925 )
									ret := -0.750000 // sell
								if( ma35 > 138.925 )
									ret := -1.000000 // sell
							if( ma40 > 140.042 )
								if( ma65 <= 149.894 )
									ret := 0.350746
								if( ma65 > 149.894 )
									ret := 0.151515
			if( ma65 > 173.559 )
				if( ma15 <= 179.614 )
					if( ma75 <= 175.399 )
						if( ma20 <= 173.884 )
							if( ma45 <= 173.396 )
								if( ma50 <= 173.319 )
									ret := -0.681818
								if( ma50 > 173.319 )
									ret := -0.107143
							if( ma45 > 173.396 )
								if( ma10 <= 174.185 )
									ret := -0.900000 // sell
								if( ma10 > 174.185 )
									ret := -0.400000
						if( ma20 > 173.884 )
							if( ma20 <= 174.093 )
								if( ma100 <= 174.995 )
									ret := 0.111111
								if( ma100 > 174.995 )
									ret := 0.875000 // buy
							if( ma20 > 174.093 )
								if( ma10_colorInt <= 2.5 )
									ret := -0.200000
								if( ma10_colorInt > 2.5 )
									ret := 0.000000
					if( ma75 > 175.399 )
						if( ma45_colorInt <= 3.5 )
							if( ma90 <= 182.22 )
								if( ma05 <= 173.691 )
									ret := -0.500000
								if( ma05 > 173.691 )
									ret := 0.000000
							if( ma90 > 182.22 )
								ret := -0.750000 // sell
						if( ma45_colorInt > 3.5 )
							if( ma15 <= 177.332 )
								if( ma60 <= 177.327 )
									ret := -0.540230
								if( ma60 > 177.327 )
									ret := -0.964286 // sell
							if( ma15 > 177.332 )
								if( ma40 <= 179.312 )
									ret := 0.062500
								if( ma40 > 179.312 )
									ret := -1.000000 // sell
				if( ma15 > 179.614 )
					if( ma25 <= 182.029 )
						if( ma85 <= 184.033 )
							if( ma80_colorInt <= 3.5 )
								ret := -0.500000
							if( ma80_colorInt > 3.5 )
								ret := 0.000000
						if( ma85 > 184.033 )
							if( ma10 <= 180.6 )
								ret := 0.333333
							if( ma10 > 180.6 )
								if( ma50 <= 182.155 )
									ret := 0.500000
								if( ma50 > 182.155 )
									ret := 0.970588 // buy
					if( ma25 > 182.029 )
						if( ma45_colorInt <= 3.5 )
							if( ma35 <= 186.36 )
								if( ma15 <= 183.01 )
									ret := -0.750000 // sell
								if( ma15 > 183.01 )
									ret := -1.000000 // sell
							if( ma35 > 186.36 )
								if( ma15 <= 342.987 )
									ret := 0.154348
								if( ma15 > 342.987 )
									ret := 0.826087 // buy
						if( ma45_colorInt > 3.5 )
							if( ma100 <= 216.784 )
								if( ma20 <= 204.061 )
									ret := -0.055351
								if( ma20 > 204.061 )
									ret := 0.257143
							if( ma100 > 216.784 )
								if( ma40 <= 230.206 )
									ret := -0.398058
								if( ma40 > 230.206 )
									ret := -0.092721
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_CRWD_15Min_d53257a0(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


