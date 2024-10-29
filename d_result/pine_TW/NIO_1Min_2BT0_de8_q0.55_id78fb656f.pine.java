//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: NIO_1Min_2BT0_78fb656f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_2BT0_78fb656f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_78fb656f(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.001281 )
		if( bbm <= 0.004626 )
			if( bbp <= -0.006595 )
				if( ema12 <= -0.003494 )
					if( bearPower <= -0.006256 )
						if( ema1 <= 4.2978 )
							if( bullPower <= -0.006732 )
								if( ema1 <= 4.15347 )
									ret := 0.360627
								if( ema1 > 4.15347 )
									ret := 0.829268 // buy
							if( bullPower > -0.006732 )
								if( bearPower <= -0.006593 )
									ret := -0.636364
								if( bearPower > -0.006593 )
									ret := 0.318182
						if( ema1 > 4.2978 )
							if( bearPower <= -0.03443 )
								if( ema13 <= -0.096317 )
									ret := 0.750000 // buy
								if( ema13 > -0.096317 )
									ret := -0.315068
							if( bearPower > -0.03443 )
								if( ema12 <= -0.004424 )
									ret := 0.154627
								if( ema12 > -0.004424 )
									ret := 0.352342
					if( bearPower > -0.006256 )
						if( ema2 <= 3.74825 )
							if( ema2 <= 3.7279 )
								ret := -0.428571
							if( ema2 > 3.7279 )
								if( bbp <= -0.010892 )
									ret := -0.500000
								if( bbp > -0.010892 )
									ret := -1.000000 // sell
						if( ema2 > 3.74825 )
							if( bbp <= -0.006997 )
								if( ema1 <= 3.75634 )
									ret := 1.000000 // buy
								if( ema1 > 3.75634 )
									ret := 0.020576
							if( bbp > -0.006997 )
								if( ema12 <= -0.005397 )
									ret := 0.000000
								if( ema12 > -0.005397 )
									ret := -0.500000
				if( ema12 > -0.003494 )
					if( ema1 <= 4.77159 )
						if( ema1 <= 3.7843 )
							if( bbp <= -0.010449 )
								if( tema <= 3.76789 )
									ret := 0.776316 // buy
								if( tema > 3.76789 )
									ret := 0.981132 // buy
							if( bbp > -0.010449 )
								if( bearPower <= -0.005199 )
									ret := -0.083333
								if( bearPower > -0.005199 )
									ret := 0.614035
						if( ema1 > 3.7843 )
							if( bullPower <= -0.004296 )
								if( ema13 <= 7.8e-05 )
									ret := 0.516550
								if( ema13 > 7.8e-05 )
									ret := 0.384615
							if( bullPower > -0.004296 )
								if( ema12 <= -0.002067 )
									ret := 0.162791
								if( ema12 > -0.002067 )
									ret := 0.385176
					if( ema1 > 4.77159 )
						if( tema <= 5.73316 )
							if( tema <= 4.80331 )
								if( ema13 <= 7.7e-05 )
									ret := -0.333333
								if( ema13 > 7.7e-05 )
									ret := 0.190476
							if( tema > 4.80331 )
								if( bearPower <= -0.005773 )
									ret := 0.423077
								if( bearPower > -0.005773 )
									ret := 0.255034
						if( tema > 5.73316 )
							if( ema13 <= -0.003815 )
								if( bbm <= 0.000318 )
									ret := 0.122807
								if( bbm > 0.000318 )
									ret := 0.882353 // buy
							if( ema13 > -0.003815 )
								if( tema <= 6.83705 )
									ret := 0.000000
								if( tema > 6.83705 )
									ret := -0.351852
			if( bbp > -0.006595 )
				if( ema12 <= -0.001191 )
					if( bullPower <= -0.002271 )
						if( ema12 <= -0.002448 )
							if( tema <= 3.83274 )
								if( ema13 <= -0.00881 )
									ret := 0.000000
								if( ema13 > -0.00881 )
									ret := -0.923077 // sell
							if( tema > 3.83274 )
								if( ema1 <= 3.86588 )
									ret := 0.333333
								if( ema1 > 3.86588 )
									ret := -0.179348
						if( ema12 > -0.002448 )
							if( ema13 <= -0.001895 )
								if( ema2 <= 4.6735 )
									ret := 0.350000
								if( ema2 > 4.6735 )
									ret := 0.006579
							if( ema13 > -0.001895 )
								if( ema1 <= 5.29265 )
									ret := -0.296296
								if( ema1 > 5.29265 )
									ret := 0.080000
					if( bullPower > -0.002271 )
						if( ema3 <= 4.52526 )
							if( ema12 <= -0.002772 )
								if( ema2 <= 3.85705 )
									ret := -0.685714
								if( ema2 > 3.85705 )
									ret := -0.360544
							if( ema12 > -0.002772 )
								if( bearPower <= -0.003525 )
									ret := -0.842105 // sell
								if( bearPower > -0.003525 )
									ret := -0.161359
						if( ema3 > 4.52526 )
							if( ema13 <= 0.0003 )
								if( bearPower <= -0.004596 )
									ret := 0.800000 // buy
								if( bearPower > -0.004596 )
									ret := -0.015337
							if( ema13 > 0.0003 )
								if( bearPower <= -0.001328 )
									ret := -1.000000 // sell
								if( bearPower > -0.001328 )
									ret := -0.500000
				if( ema12 > -0.001191 )
					if( bearPower <= -0.001916 )
						if( ema1 <= 5.53792 )
							if( ema1 <= 3.86063 )
								if( tema <= 3.79332 )
									ret := 0.216216
								if( tema > 3.79332 )
									ret := 0.662338
							if( ema1 > 3.86063 )
								if( tema <= 3.87215 )
									ret := -0.846154 // sell
								if( tema > 3.87215 )
									ret := 0.237435
						if( ema1 > 5.53792 )
							if( bearPower <= -0.003183 )
								if( tema <= 6.26365 )
									ret := -0.583333
								if( tema > 6.26365 )
									ret := 0.200000
							if( bearPower > -0.003183 )
								if( ema1 <= 6.24462 )
									ret := -0.096774
								if( ema1 > 6.24462 )
									ret := 0.216216
					if( bearPower > -0.001916 )
						if( ema12 <= 0.001882 )
							if( bullPower <= 0.001303 )
								if( ema2 <= 4.40818 )
									ret := 0.089671
								if( ema2 > 4.40818 )
									ret := -0.026046
							if( bullPower > 0.001303 )
								if( bullPower <= 0.004269 )
									ret := 0.237500
								if( bullPower > 0.004269 )
									ret := -0.277778
						if( ema12 > 0.001882 )
							if( tema <= 3.73282 )
								ret := -1.000000 // sell
							if( tema > 3.73282 )
								if( ema2 <= 3.79081 )
									ret := 0.928571 // buy
								if( ema2 > 3.79081 )
									ret := 0.216963
		if( bbm > 0.004626 )
			if( ema12 <= -0.000413 )
				if( bearPower <= -0.00754 )
					if( ema3 <= 5.28083 )
						if( ema12 <= -0.015246 )
							if( tema <= 4.35257 )
								if( ema3 <= 4.35076 )
									ret := 0.268966
								if( ema3 > 4.35076 )
									ret := 0.803571 // buy
							if( tema > 4.35257 )
								if( ema2 <= 4.4569 )
									ret := -0.631579
								if( ema2 > 4.4569 )
									ret := 0.202502
						if( ema12 > -0.015246 )
							if( bbp <= -0.020141 )
								if( ema13 <= -0.022036 )
									ret := -0.164804
								if( ema13 > -0.022036 )
									ret := 0.036790
							if( bbp > -0.020141 )
								if( ema13 <= -0.008989 )
									ret := 0.186651
								if( ema13 > -0.008989 )
									ret := 0.089373
					if( ema3 > 5.28083 )
						if( ema2 <= 5.29646 )
							if( bearPower <= -0.031196 )
								if( bearPower <= -0.105883 )
									ret := -0.913043 // sell
								if( bearPower > -0.105883 )
									ret := 0.102740
							if( bearPower > -0.031196 )
								if( ema12 <= -0.013752 )
									ret := -0.932203 // sell
								if( ema12 > -0.013752 )
									ret := -0.278571
						if( ema2 > 5.29646 )
							if( bbm <= 0.010683 )
								if( bbp <= -0.135003 )
									ret := -0.676471
								if( bbp > -0.135003 )
									ret := 0.108327
							if( bbm > 0.010683 )
								if( ema12 <= -0.101563 )
									ret := -0.766667 // sell
								if( ema12 > -0.101563 )
									ret := -0.026847
				if( bearPower > -0.00754 )
					if( ema1 <= 3.79447 )
						if( ema13 <= -0.004152 )
							if( ema12 <= -0.002112 )
								if( bbm <= 0.007169 )
									ret := -0.105263
								if( bbm > 0.007169 )
									ret := 0.483333
							if( ema12 > -0.002112 )
								if( bearPower <= 0.000168 )
									ret := -0.354839
								if( bearPower > 0.000168 )
									ret := 0.800000 // buy
						if( ema13 > -0.004152 )
							if( bbp <= -0.007728 )
								if( ema12 <= -0.001175 )
									ret := -1.000000 // sell
								if( ema12 > -0.001175 )
									ret := 0.250000
							if( bbp > -0.007728 )
								if( bbp <= -0.001111 )
									ret := 0.740310 // buy
								if( bbp > -0.001111 )
									ret := 0.466667
					if( ema1 > 3.79447 )
						if( bullPower <= 0.003511 )
							if( ema13 <= -0.002158 )
								if( ema3 <= 3.80165 )
									ret := -0.833333 // sell
								if( ema3 > 3.80165 )
									ret := 0.014255
							if( ema13 > -0.002158 )
								if( ema12 <= -0.000716 )
									ret := 0.285307
								if( ema12 > -0.000716 )
									ret := 0.055233
						if( bullPower > 0.003511 )
							if( ema3 <= 3.82106 )
								if( ema13 <= -0.002473 )
									ret := -0.555556
								if( ema13 > -0.002473 )
									ret := 0.156250
							if( ema3 > 3.82106 )
								if( tema <= 4.46181 )
									ret := 0.299606
								if( tema > 4.46181 )
									ret := 0.170811
			if( ema12 > -0.000413 )
				if( bullPower <= 0.005637 )
					if( ema3 <= 3.80323 )
						if( ema2 <= 3.68578 )
							if( bbp <= -0.005401 )
								ret := 0.250000
							if( bbp > -0.005401 )
								ret := 1.000000 // buy
						if( ema2 > 3.68578 )
							if( tema <= 3.71801 )
								if( ema3 <= 3.71472 )
									ret := 0.009615
								if( ema3 > 3.71472 )
									ret := -0.800000 // sell
							if( tema > 3.71801 )
								if( ema2 <= 3.72756 )
									ret := 0.518519
								if( ema2 > 3.72756 )
									ret := 0.114458
					if( ema3 > 3.80323 )
						if( bearPower <= -0.006186 )
							if( ema1 <= 3.81684 )
								if( bbm <= 0.012957 )
									ret := -0.857143 // sell
								if( bbm > 0.012957 )
									ret := 0.000000
							if( ema1 > 3.81684 )
								if( ema3 <= 3.82794 )
									ret := 0.515152
								if( ema3 > 3.82794 )
									ret := -0.124881
						if( bearPower > -0.006186 )
							if( ema1 <= 3.86509 )
								if( bbm <= 0.007276 )
									ret := 0.139241
								if( bbm > 0.007276 )
									ret := -0.388601
							if( ema1 > 3.86509 )
								if( bullPower <= 0.000204 )
									ret := 0.270588
								if( bullPower > 0.000204 )
									ret := -0.031698
				if( bullPower > 0.005637 )
					if( bbm <= 0.03347 )
						if( ema3 <= 3.7097 )
							if( bbp <= 0.011774 )
								if( ema12 <= 0.003375 )
									ret := 0.579545
								if( ema12 > 0.003375 )
									ret := -0.040000
							if( bbp > 0.011774 )
								if( ema2 <= 3.70637 )
									ret := 0.883721 // buy
								if( ema2 > 3.70637 )
									ret := 0.400000
						if( ema3 > 3.7097 )
							if( ema1 <= 7.10472 )
								if( ema12 <= 0.001775 )
									ret := 0.098666
								if( ema12 > 0.001775 )
									ret := 0.008096
							if( ema1 > 7.10472 )
								if( ema3 <= 7.12803 )
									ret := -0.619048
								if( ema3 > 7.12803 )
									ret := -0.153005
					if( bbm > 0.03347 )
						if( tema <= 3.74933 )
							if( ema3 <= 3.73176 )
								if( bearPower <= -0.001382 )
									ret := 1.000000 // buy
								if( bearPower > -0.001382 )
									ret := 0.500000
							if( ema3 > 3.73176 )
								ret := 0.333333
						if( tema > 3.74933 )
							if( bbm <= 0.060565 )
								if( bullPower <= 0.034583 )
									ret := -0.219378
								if( bullPower > 0.034583 )
									ret := 0.035714
							if( bbm > 0.060565 )
								if( ema2 <= 5.52066 )
									ret := -0.498233
								if( ema2 > 5.52066 )
									ret := 0.052083
	if( bearPower > 0.001281 )
		if( bbm <= 0.004919 )
			if( ema12 <= 0.002268 )
				if( bearPower <= 0.003482 )
					if( ema1 <= 3.67259 )
						ret := 1.000000 // buy
					if( ema1 > 3.67259 )
						if( tema <= 4.69812 )
							if( bbp <= 0.00763 )
								if( bearPower <= 0.002679 )
									ret := -0.139711
								if( bearPower > 0.002679 )
									ret := -0.277267
							if( bbp > 0.00763 )
								if( bbm <= 0.003227 )
									ret := 0.666667
								if( bbm > 0.003227 )
									ret := 0.153846
						if( tema > 4.69812 )
							if( ema2 <= 4.84629 )
								if( ema3 <= 4.83604 )
									ret := 0.046980
								if( ema3 > 4.83604 )
									ret := 0.722222 // buy
							if( ema2 > 4.84629 )
								if( bbm <= 0.000934 )
									ret := -0.078073
								if( bbm > 0.000934 )
									ret := -0.409836
				if( bearPower > 0.003482 )
					if( ema3 <= 5.66675 )
						if( bbm <= 8.2e-05 )
							if( ema2 <= 4.61589 )
								if( ema12 <= 0.000372 )
									ret := -0.326279
								if( ema12 > 0.000372 )
									ret := -0.470728
							if( ema2 > 4.61589 )
								if( ema2 <= 4.76565 )
									ret := -0.210762
								if( ema2 > 4.76565 )
									ret := -0.341873
						if( bbm > 8.2e-05 )
							if( ema3 <= 3.71199 )
								if( ema2 <= 3.70546 )
									ret := 0.000000
								if( ema2 > 3.70546 )
									ret := 1.000000 // buy
							if( ema3 > 3.71199 )
								if( bearPower <= 0.003618 )
									ret := -0.653846
								if( bearPower > 0.003618 )
									ret := -0.165605
					if( ema3 > 5.66675 )
						if( tema <= 5.72606 )
							if( ema3 <= 5.71292 )
								ret := 0.000000
							if( ema3 > 5.71292 )
								if( ema12 <= 0.000274 )
									ret := 0.600000
								if( ema12 > 0.000274 )
									ret := 0.900000 // buy
						if( tema > 5.72606 )
							if( ema13 <= -0.003474 )
								if( ema12 <= -0.007124 )
									ret := -0.800000 // sell
								if( ema12 > -0.007124 )
									ret := 0.500000
							if( ema13 > -0.003474 )
								if( tema <= 7.39731 )
									ret := -0.125000
								if( tema > 7.39731 )
									ret := -1.000000 // sell
			if( ema12 > 0.002268 )
				if( bbp <= 0.014106 )
					if( ema12 <= 0.004958 )
						if( bbm <= 0.002208 )
							if( bearPower <= 0.00303 )
								if( ema1 <= 6.92843 )
									ret := 0.196319
								if( ema1 > 6.92843 )
									ret := -0.600000
							if( bearPower > 0.00303 )
								if( bbm <= 0.000344 )
									ret := -0.072126
								if( bbm > 0.000344 )
									ret := 0.185567
						if( bbm > 0.002208 )
							if( bullPower <= 0.008434 )
								if( ema12 <= 0.004051 )
									ret := -0.566265
								if( ema12 > 0.004051 )
									ret := 0.363636
							if( bullPower > 0.008434 )
								if( bbm <= 0.004033 )
									ret := 1.000000 // buy
								if( bbm > 0.004033 )
									ret := 0.250000
					if( ema12 > 0.004958 )
						if( ema1 <= 5.43235 )
							if( tema <= 3.78481 )
								if( ema2 <= 3.75617 )
									ret := -0.250000
								if( ema2 > 3.75617 )
									ret := -1.000000 // sell
							if( tema > 3.78481 )
								if( ema2 <= 4.4435 )
									ret := 0.478571
								if( ema2 > 4.4435 )
									ret := 0.186207
						if( ema1 > 5.43235 )
							if( ema3 <= 6.75762 )
								if( ema13 <= 0.015423 )
									ret := -0.184615
								if( ema13 > 0.015423 )
									ret := 0.304348
							if( ema3 > 6.75762 )
								if( ema13 <= 0.009883 )
									ret := 0.000000
								if( ema13 > 0.009883 )
									ret := -0.687500
				if( bbp > 0.014106 )
					if( ema1 <= 4.54688 )
						if( bearPower <= 0.013393 )
							if( ema12 <= 0.005167 )
								if( ema13 <= 0.002859 )
									ret := 0.166667
								if( ema13 > 0.002859 )
									ret := -0.361419
							if( ema12 > 0.005167 )
								if( tema <= 4.44081 )
									ret := 0.042042
								if( tema > 4.44081 )
									ret := -0.325301
						if( bearPower > 0.013393 )
							if( ema2 <= 4.08441 )
								if( ema1 <= 3.78826 )
									ret := -0.095238
								if( ema1 > 3.78826 )
									ret := -0.689189
							if( ema2 > 4.08441 )
								if( ema12 <= 0.033139 )
									ret := -0.315789
								if( ema12 > 0.033139 )
									ret := 0.727273 // buy
					if( ema1 > 4.54688 )
						if( ema3 <= 4.85151 )
							if( ema13 <= 0.003094 )
								if( ema12 <= 0.003408 )
									ret := -0.750000 // sell
								if( ema12 > 0.003408 )
									ret := 0.500000
							if( ema13 > 0.003094 )
								if( ema3 <= 4.78344 )
									ret := 0.038462
								if( ema3 > 4.78344 )
									ret := 0.415094
						if( ema3 > 4.85151 )
							if( tema <= 5.40659 )
								if( ema2 <= 5.28712 )
									ret := -0.129870
								if( ema2 > 5.28712 )
									ret := -0.413043
							if( tema > 5.40659 )
								if( ema13 <= 0.027175 )
									ret := -0.016477
								if( ema13 > 0.027175 )
									ret := -0.455696
		if( bbm > 0.004919 )
			if( tema <= 6.90883 )
				if( ema2 <= 4.87831 )
					if( bbp <= 0.036202 )
						if( ema1 <= 4.87324 )
							if( tema <= 3.72199 )
								if( bbm <= 0.010213 )
									ret := 0.372549
								if( bbm > 0.010213 )
									ret := 0.852941 // buy
							if( tema > 3.72199 )
								if( ema2 <= 3.73082 )
									ret := -0.702128 // sell
								if( ema2 > 3.73082 )
									ret := 0.061615
						if( ema1 > 4.87324 )
							if( ema3 <= 4.86621 )
								if( ema12 <= 0.010464 )
									ret := 0.000000
								if( ema12 > 0.010464 )
									ret := -0.800000 // sell
							if( ema3 > 4.86621 )
								if( bbm <= 0.010033 )
									ret := -0.652174
								if( bbm > 0.010033 )
									ret := -1.000000 // sell
					if( bbp > 0.036202 )
						if( bbp <= 0.044202 )
							if( ema13 <= 0.03917 )
								if( ema3 <= 3.73182 )
									ret := -0.793103 // sell
								if( ema3 > 3.73182 )
									ret := -0.247920
							if( ema13 > 0.03917 )
								if( bbm <= 0.026927 )
									ret := 0.571429
								if( bbm > 0.026927 )
									ret := -1.000000 // sell
						if( bbp > 0.044202 )
							if( ema3 <= 4.4242 )
								if( tema <= 4.22289 )
									ret := -0.140260
								if( tema > 4.22289 )
									ret := 0.338889
							if( ema3 > 4.4242 )
								if( bullPower <= 0.094236 )
									ret := -0.205128
								if( bullPower > 0.094236 )
									ret := 0.833333 // buy
				if( ema2 > 4.87831 )
					if( tema <= 5.48368 )
						if( ema12 <= 0.011402 )
							if( ema3 <= 5.42127 )
								if( ema2 <= 4.89019 )
									ret := 0.620000
								if( ema2 > 4.89019 )
									ret := 0.014417
							if( ema3 > 5.42127 )
								if( ema3 <= 5.4531 )
									ret := 0.613260
								if( ema3 > 5.4531 )
									ret := 0.000000
						if( ema12 > 0.011402 )
							if( ema2 <= 5.29707 )
								if( ema3 <= 5.25495 )
									ret := 0.306528
								if( ema3 > 5.25495 )
									ret := -0.563025
							if( ema2 > 5.29707 )
								if( ema3 <= 5.40737 )
									ret := 0.516373
								if( ema3 > 5.40737 )
									ret := -0.068493
					if( tema > 5.48368 )
						if( ema3 <= 5.74165 )
							if( bearPower <= 0.072379 )
								if( ema12 <= 0.01881 )
									ret := -0.078181
								if( ema12 > 0.01881 )
									ret := -0.451264
							if( bearPower > 0.072379 )
								if( ema13 <= 0.133637 )
									ret := 0.804878 // buy
								if( ema13 > 0.133637 )
									ret := -0.333333
						if( ema3 > 5.74165 )
							if( ema2 <= 5.75021 )
								if( ema2 <= 5.74422 )
									ret := -0.200000
								if( ema2 > 5.74422 )
									ret := 0.882353 // buy
							if( ema2 > 5.75021 )
								if( ema13 <= 0.125111 )
									ret := 0.122030
								if( ema13 > 0.125111 )
									ret := -0.517241
			if( tema > 6.90883 )
				if( ema3 <= 6.84849 )
					if( ema1 <= 6.81421 )
						ret := 1.000000 // buy
					if( ema1 > 6.81421 )
						if( ema13 <= 0.052851 )
							ret := 0.250000
						if( ema13 > 0.052851 )
							if( ema2 <= 6.78434 )
								ret := -0.250000
							if( ema2 > 6.78434 )
								if( ema2 <= 6.94103 )
									ret := -0.968254 // sell
								if( ema2 > 6.94103 )
									ret := -0.500000
				if( ema3 > 6.84849 )
					if( bearPower <= 0.009123 )
						if( ema1 <= 7.56256 )
							if( ema1 <= 6.96766 )
								if( ema3 <= 6.89049 )
									ret := -0.666667
								if( ema3 > 6.89049 )
									ret := 0.678571
							if( ema1 > 6.96766 )
								if( ema3 <= 7.02985 )
									ret := -0.300000
								if( ema3 > 7.02985 )
									ret := 0.182979
						if( ema1 > 7.56256 )
							ret := -1.000000 // sell
					if( bearPower > 0.009123 )
						if( ema1 <= 7.16606 )
							if( ema3 <= 6.94868 )
								if( bullPower <= 0.034336 )
									ret := 0.418605
								if( bullPower > 0.034336 )
									ret := -0.185185
							if( ema3 > 6.94868 )
								if( ema13 <= 0.007938 )
									ret := 0.000000
								if( ema13 > 0.007938 )
									ret := -0.625000
						if( ema1 > 7.16606 )
							if( ema1 <= 7.40226 )
								if( bbp <= 0.077177 )
									ret := 0.552941
								if( bbp > 0.077177 )
									ret := -0.040000
							if( ema1 > 7.40226 )
								if( ema12 <= 0.037352 )
									ret := -0.276923
								if( ema12 > 0.037352 )
									ret := -0.864865 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_NIO_1Min_78fb656f(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


