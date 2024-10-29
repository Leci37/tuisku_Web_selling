//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: XRPUSDT_15Min_2BM0_e2c703f1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_15Min_2BM0_e2c703f1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_15Min_e2c703f1(bbp, bullPower, BBPower_Color, bearPower, bbm, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.003407 )
		if( bearPower <= -0.011544 )
			if( Money_Flow_Ratio <= 0.186483 )
				if( Negative_Money_Flow <= 2.71763e+06 )
					if( Negative_Money_Flow_Sum <= 6.52274e+07 )
						if( bullPower <= -0.009232 )
							ret := -1.000000 // sell
						if( bullPower > -0.009232 )
							if( Negative_Money_Flow_Sum <= 5.15744e+07 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 5.15744e+07 )
								ret := 0.500000
					if( Negative_Money_Flow_Sum > 6.52274e+07 )
						if( Positive_Money_Flow <= 4.93567e+06 )
							ret := 0.400000
						if( Positive_Money_Flow > 4.93567e+06 )
							ret := 1.000000 // buy
				if( Negative_Money_Flow > 2.71763e+06 )
					if( Negative_Money_Flow_Sum <= 2.31255e+07 )
						if( MFI_Low <= -7.42751 )
							ret := -0.250000
						if( MFI_Low > -7.42751 )
							ret := -0.666667
					if( Negative_Money_Flow_Sum > 2.31255e+07 )
						if( MFI_High <= -68.8744 )
							if( Negative_Money_Flow_Sum <= 5.785e+07 )
								if( bullPower <= -0.007974 )
									ret := 0.176471
								if( bullPower > -0.007974 )
									ret := 0.787879 // buy
							if( Negative_Money_Flow_Sum > 5.785e+07 )
								if( bullPower <= -0.012414 )
									ret := 0.750000 // buy
								if( bullPower > -0.012414 )
									ret := 0.972603 // buy
						if( MFI_High > -68.8744 )
							if( Negative_Money_Flow <= 9.47179e+06 )
								if( bbm <= 0.007562 )
									ret := 0.634921
								if( bbm > 0.007562 )
									ret := 0.936170 // buy
							if( Negative_Money_Flow > 9.47179e+06 )
								if( bbp <= -0.033691 )
									ret := 0.793103 // buy
								if( bbp > -0.033691 )
									ret := 0.156863
			if( Money_Flow_Ratio > 0.186483 )
				if( bearPower <= -0.028894 )
					if( Typical_Price <= 0.705091 )
						if( bullPower <= -0.036313 )
							ret := -0.250000
						if( bullPower > -0.036313 )
							if( Negative_Money_Flow_Sum <= 6.81369e+07 )
								if( bbm <= 0.0271 )
									ret := -1.000000 // sell
								if( bbm > 0.0271 )
									ret := 0.875000 // buy
							if( Negative_Money_Flow_Sum > 6.81369e+07 )
								if( Negative_Money_Flow <= 2.70493e+07 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow > 2.70493e+07 )
									ret := 0.571429
					if( Typical_Price > 0.705091 )
						if( Positive_Money_Flow_Sum <= 8.07367e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 8.07367e+07 )
							ret := 0.400000
				if( bearPower > -0.028894 )
					if( Negative_Money_Flow_Sum <= 7.27058e+07 )
						if( Negative_Money_Flow_Sum <= 6.89243e+07 )
							if( Negative_Money_Flow <= 7.44667e+06 )
								if( Positive_Money_Flow_Sum <= 1.69835e+07 )
									ret := 0.195652
								if( Positive_Money_Flow_Sum > 1.69835e+07 )
									ret := -0.226667
							if( Negative_Money_Flow > 7.44667e+06 )
								if( Positive_Money_Flow_Sum <= 2.21213e+07 )
									ret := 0.223270
								if( Positive_Money_Flow_Sum > 2.21213e+07 )
									ret := 0.622047
						if( Negative_Money_Flow_Sum > 6.89243e+07 )
							if( Typical_Price <= 0.722492 )
								if( bbm <= 0.0068 )
									ret := -0.625000
								if( bbm > 0.0068 )
									ret := -0.968750 // sell
							if( Typical_Price > 0.722492 )
								ret := 0.500000
					if( Negative_Money_Flow_Sum > 7.27058e+07 )
						if( MFI_Low <= 22.6379 )
							if( bbm <= 0.013801 )
								if( Negative_Money_Flow_Sum <= 1.47133e+08 )
									ret := 0.362573
								if( Negative_Money_Flow_Sum > 1.47133e+08 )
									ret := 0.914894 // buy
							if( bbm > 0.013801 )
								if( Negative_Money_Flow_Sum <= 1.426e+08 )
									ret := 0.871429 // buy
								if( Negative_Money_Flow_Sum > 1.426e+08 )
									ret := 0.142857
						if( MFI_Low > 22.6379 )
							if( Money_Flow_Ratio <= 1.06493 )
								if( Typical_Price <= 0.641215 )
									ret := -0.481481
								if( Typical_Price > 0.641215 )
									ret := 0.857143 // buy
							if( Money_Flow_Ratio > 1.06493 )
								if( Money_Flow_Ratio <= 1.34985 )
									ret := -0.941176 // sell
								if( Money_Flow_Ratio > 1.34985 )
									ret := -0.250000
		if( bearPower > -0.011544 )
			if( Typical_Price <= 0.599824 )
				if( Negative_Money_Flow_Sum <= 1.86723e+07 )
					if( Positive_Money_Flow_Sum <= 1.30537e+07 )
						if( Raw_Money_Flow <= 4.61225e+06 )
							if( Negative_Money_Flow_Sum <= 1.32006e+07 )
								if( Negative_Money_Flow_Sum <= 7.48514e+06 )
									ret := 0.035613
								if( Negative_Money_Flow_Sum > 7.48514e+06 )
									ret := 0.199480
							if( Negative_Money_Flow_Sum > 1.32006e+07 )
								if( Negative_Money_Flow_Sum <= 1.48265e+07 )
									ret := -0.058185
								if( Negative_Money_Flow_Sum > 1.48265e+07 )
									ret := 0.092476
						if( Raw_Money_Flow > 4.61225e+06 )
							if( Money_Flow_Ratio <= 0.22417 )
								if( Typical_Price <= 0.438533 )
									ret := -0.750000 // sell
								if( Typical_Price > 0.438533 )
									ret := -0.222222
							if( Money_Flow_Ratio > 0.22417 )
								if( Negative_Money_Flow_Sum <= 1.79479e+07 )
									ret := 0.610329
								if( Negative_Money_Flow_Sum > 1.79479e+07 )
									ret := -0.166667
					if( Positive_Money_Flow_Sum > 1.30537e+07 )
						if( Negative_Money_Flow_Sum <= 1.74902e+07 )
							if( Negative_Money_Flow_Sum <= 1.69672e+07 )
								if( Positive_Money_Flow_Sum <= 1.84456e+07 )
									ret := -0.278986
								if( Positive_Money_Flow_Sum > 1.84456e+07 )
									ret := 0.371429
							if( Negative_Money_Flow_Sum > 1.69672e+07 )
								if( Positive_Money_Flow_Sum <= 1.35601e+07 )
									ret := -0.428571
								if( Positive_Money_Flow_Sum > 1.35601e+07 )
									ret := 0.603774
						if( Negative_Money_Flow_Sum > 1.74902e+07 )
							if( Negative_Money_Flow <= 655997 )
								if( Positive_Money_Flow_Sum <= 1.40505e+07 )
									ret := 0.818182 // buy
								if( Positive_Money_Flow_Sum > 1.40505e+07 )
									ret := -0.290323
							if( Negative_Money_Flow > 655997 )
								if( Typical_Price <= 0.473431 )
									ret := -0.933333 // sell
								if( Typical_Price > 0.473431 )
									ret := -0.347826
				if( Negative_Money_Flow_Sum > 1.86723e+07 )
					if( MFI <= 44.2785 )
						if( Money_Flow_Ratio <= 0.37181 )
							if( Raw_Money_Flow <= 5.83188e+06 )
								if( bbm <= 0.004038 )
									ret := 0.162441
								if( bbm > 0.004038 )
									ret := 0.346774
							if( Raw_Money_Flow > 5.83188e+06 )
								if( Typical_Price <= 0.502267 )
									ret := 0.252174
								if( Typical_Price > 0.502267 )
									ret := -0.485714
						if( Money_Flow_Ratio > 0.37181 )
							if( MFI <= 33.5437 )
								if( Positive_Money_Flow <= 6.72935e+06 )
									ret := 0.389782
								if( Positive_Money_Flow > 6.72935e+06 )
									ret := -0.684211
							if( MFI > 33.5437 )
								if( Money_Flow_Ratio <= 0.534106 )
									ret := 0.013652
								if( Money_Flow_Ratio > 0.534106 )
									ret := 0.277990
					if( MFI > 44.2785 )
						if( bearPower <= -0.005308 )
							if( Money_Flow_Ratio <= 0.89741 )
								if( bbm <= 0.006601 )
									ret := -0.550000
								if( bbm > 0.006601 )
									ret := 0.147059
							if( Money_Flow_Ratio > 0.89741 )
								if( Negative_Money_Flow_Sum <= 9.99874e+07 )
									ret := -0.017794
								if( Negative_Money_Flow_Sum > 9.99874e+07 )
									ret := 1.000000 // buy
						if( bearPower > -0.005308 )
							if( bearPower <= -0.003227 )
								if( MFI_Low <= 35.3357 )
									ret := 0.330065
								if( MFI_Low > 35.3357 )
									ret := -0.138462
							if( bearPower > -0.003227 )
								if( Typical_Price <= 0.590058 )
									ret := -0.545455
								if( Typical_Price > 0.590058 )
									ret := 0.600000
			if( Typical_Price > 0.599824 )
				if( Negative_Money_Flow_Sum <= 3.59382e+07 )
					if( Negative_Money_Flow_Sum <= 3.40736e+07 )
						if( MFI_Low <= 15.8768 )
							if( Money_Flow_Ratio <= 0.461625 )
								if( bullPower <= -0.000318 )
									ret := -0.010432
								if( bullPower > -0.000318 )
									ret := -0.414286
							if( Money_Flow_Ratio > 0.461625 )
								if( bbm <= 0.004015 )
									ret := -0.136585
								if( bbm > 0.004015 )
									ret := -0.464286
						if( MFI_Low > 15.8768 )
							if( Negative_Money_Flow <= 2.57091e+06 )
								if( bullPower <= 0.000541 )
									ret := 0.113597
								if( bullPower > 0.000541 )
									ret := 0.612903
							if( Negative_Money_Flow > 2.57091e+06 )
								if( MFI_Low <= 24.7256 )
									ret := 0.071429
								if( MFI_Low > 24.7256 )
									ret := -0.221198
					if( Negative_Money_Flow_Sum > 3.40736e+07 )
						if( bbp <= -0.013055 )
							ret := 0.800000 // buy
						if( bbp > -0.013055 )
							if( Raw_Money_Flow <= 2.71341e+06 )
								if( Positive_Money_Flow_Sum <= 1.29997e+07 )
									ret := -0.357143
								if( Positive_Money_Flow_Sum > 1.29997e+07 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 2.71341e+06 )
								if( MFI_High <= -62.9637 )
									ret := 0.400000
								if( MFI_High > -62.9637 )
									ret := -0.816327 // sell
				if( Negative_Money_Flow_Sum > 3.59382e+07 )
					if( MFI_Low <= -2.80305 )
						if( Positive_Money_Flow_Sum <= 7.87521e+06 )
							if( bearPower <= -0.008445 )
								if( bbp <= -0.01512 )
									ret := 0.750000 // buy
								if( bbp > -0.01512 )
									ret := 1.000000 // buy
							if( bearPower > -0.008445 )
								if( bbm <= 0.002568 )
									ret := -0.700000 // sell
								if( bbm > 0.002568 )
									ret := 0.060606
						if( Positive_Money_Flow_Sum > 7.87521e+06 )
							if( MFI_High <= -68.5299 )
								ret := 0.250000
							if( MFI_High > -68.5299 )
								if( Positive_Money_Flow <= 3.1134e+06 )
									ret := -0.893617 // sell
								if( Positive_Money_Flow > 3.1134e+06 )
									ret := -0.416667
					if( MFI_Low > -2.80305 )
						if( Raw_Money_Flow <= 4.83017e+06 )
							if( Negative_Money_Flow_Sum <= 9.76055e+07 )
								if( Positive_Money_Flow <= 2.11387e+06 )
									ret := 0.486559
								if( Positive_Money_Flow > 2.11387e+06 )
									ret := 0.213768
							if( Negative_Money_Flow_Sum > 9.76055e+07 )
								if( bearPower <= -0.00821 )
									ret := -0.500000
								if( bearPower > -0.00821 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 4.83017e+06 )
							if( Money_Flow_Ratio <= 0.691626 )
								if( Positive_Money_Flow_Sum <= 2.21034e+07 )
									ret := -0.183673
								if( Positive_Money_Flow_Sum > 2.21034e+07 )
									ret := 0.247104
							if( Money_Flow_Ratio > 0.691626 )
								if( bbm <= 0.006745 )
									ret := -0.500000
								if( bbm > 0.006745 )
									ret := 0.164557
	if( bbp > -0.003407 )
		if( bbp <= 0.006003 )
			if( bbm <= 0.001601 )
				if( Positive_Money_Flow_Sum <= 1.17984e+07 )
					if( Negative_Money_Flow_Sum <= 1.45448e+07 )
						if( Negative_Money_Flow_Sum <= 3.58569e+06 )
							if( Positive_Money_Flow_Sum <= 2.93545e+06 )
								if( Typical_Price <= 0.327417 )
									ret := -0.791667 // sell
								if( Typical_Price > 0.327417 )
									ret := -0.029684
							if( Positive_Money_Flow_Sum > 2.93545e+06 )
								if( Positive_Money_Flow_Sum <= 4.7251e+06 )
									ret := 0.102021
								if( Positive_Money_Flow_Sum > 4.7251e+06 )
									ret := -0.001466
						if( Negative_Money_Flow_Sum > 3.58569e+06 )
							if( Raw_Money_Flow <= 928634 )
								if( Typical_Price <= 0.332594 )
									ret := 0.155327
								if( Typical_Price > 0.332594 )
									ret := -0.025908
							if( Raw_Money_Flow > 928634 )
								if( Negative_Money_Flow_Sum <= 6.33156e+06 )
									ret := -0.172786
								if( Negative_Money_Flow_Sum > 6.33156e+06 )
									ret := -0.042606
					if( Negative_Money_Flow_Sum > 1.45448e+07 )
						if( Positive_Money_Flow_Sum <= 7.90597e+06 )
							if( Raw_Money_Flow <= 1.57073e+06 )
								if( Typical_Price <= 0.400497 )
									ret := 0.294798
								if( Typical_Price > 0.400497 )
									ret := 0.059197
							if( Raw_Money_Flow > 1.57073e+06 )
								if( Typical_Price <= 0.510924 )
									ret := 0.570093
								if( Typical_Price > 0.510924 )
									ret := 0.111111
						if( Positive_Money_Flow_Sum > 7.90597e+06 )
							if( Negative_Money_Flow <= 1.18395e+06 )
								if( Raw_Money_Flow <= 1.47016e+06 )
									ret := -0.152513
								if( Raw_Money_Flow > 1.47016e+06 )
									ret := 0.128788
							if( Negative_Money_Flow > 1.18395e+06 )
								if( Positive_Money_Flow_Sum <= 1.08743e+07 )
									ret := 0.251208
								if( Positive_Money_Flow_Sum > 1.08743e+07 )
									ret := -0.118644
				if( Positive_Money_Flow_Sum > 1.17984e+07 )
					if( Typical_Price <= 0.476061 )
						if( Money_Flow_Ratio <= 1.16428 )
							if( bearPower <= 0.0001 )
								if( bbm <= 0.0016 )
									ret := 0.472868
								if( bbm > 0.0016 )
									ret := 0.054054
							if( bearPower > 0.0001 )
								if( Negative_Money_Flow_Sum <= 1.23627e+07 )
									ret := -0.687500
								if( Negative_Money_Flow_Sum > 1.23627e+07 )
									ret := 0.305085
						if( Money_Flow_Ratio > 1.16428 )
							if( Positive_Money_Flow <= 1.14699e+06 )
								if( Raw_Money_Flow <= 527102 )
									ret := -0.305556
								if( Raw_Money_Flow > 527102 )
									ret := 0.233366
							if( Positive_Money_Flow > 1.14699e+06 )
								if( bullPower <= 0.002233 )
									ret := -0.133028
								if( bullPower > 0.002233 )
									ret := 0.182353
					if( Typical_Price > 0.476061 )
						if( Negative_Money_Flow_Sum <= 1.04036e+07 )
							if( Positive_Money_Flow_Sum <= 1.6256e+07 )
								if( Typical_Price <= 0.634356 )
									ret := -0.089898
								if( Typical_Price > 0.634356 )
									ret := 0.257143
							if( Positive_Money_Flow_Sum > 1.6256e+07 )
								if( Typical_Price <= 0.522622 )
									ret := 0.168103
								if( Typical_Price > 0.522622 )
									ret := -0.049724
						if( Negative_Money_Flow_Sum > 1.04036e+07 )
							if( Positive_Money_Flow_Sum <= 2.0449e+07 )
								if( Typical_Price <= 0.495622 )
									ret := 0.221622
								if( Typical_Price > 0.495622 )
									ret := -0.001485
							if( Positive_Money_Flow_Sum > 2.0449e+07 )
								if( Positive_Money_Flow_Sum <= 2.11084e+07 )
									ret := 0.465116
								if( Positive_Money_Flow_Sum > 2.11084e+07 )
									ret := 0.182540
			if( bbm > 0.001601 )
				if( Negative_Money_Flow_Sum <= 6.64234e+07 )
					if( Negative_Money_Flow_Sum <= 2.23277e+07 )
						if( Typical_Price <= 0.568359 )
							if( Negative_Money_Flow <= 2.66669e+06 )
								if( Negative_Money_Flow <= 1.8473e+06 )
									ret := 0.063030
								if( Negative_Money_Flow > 1.8473e+06 )
									ret := -0.058619
							if( Negative_Money_Flow > 2.66669e+06 )
								if( MFI <= 75.576 )
									ret := 0.164526
								if( MFI > 75.576 )
									ret := 0.631579
						if( Typical_Price > 0.568359 )
							if( MFI_Low <= 11.8888 )
								if( bullPower <= 0.002942 )
									ret := -0.222951
								if( bullPower > 0.002942 )
									ret := 1.000000 // buy
							if( MFI_Low > 11.8888 )
								if( Positive_Money_Flow <= 3.59078e+06 )
									ret := 0.002654
								if( Positive_Money_Flow > 3.59078e+06 )
									ret := -0.164706
					if( Negative_Money_Flow_Sum > 2.23277e+07 )
						if( Typical_Price <= 0.542541 )
							if( Positive_Money_Flow_Sum <= 4.05648e+07 )
								if( Negative_Money_Flow_Sum <= 2.99822e+07 )
									ret := 0.186500
								if( Negative_Money_Flow_Sum > 2.99822e+07 )
									ret := 0.396407
							if( Positive_Money_Flow_Sum > 4.05648e+07 )
								if( Positive_Money_Flow_Sum <= 5.9968e+07 )
									ret := -0.172996
								if( Positive_Money_Flow_Sum > 5.9968e+07 )
									ret := 0.382979
						if( Typical_Price > 0.542541 )
							if( Positive_Money_Flow_Sum <= 1.11329e+08 )
								if( Negative_Money_Flow <= 8.61935e+06 )
									ret := 0.037918
								if( Negative_Money_Flow > 8.61935e+06 )
									ret := 0.443038
							if( Positive_Money_Flow_Sum > 1.11329e+08 )
								if( Positive_Money_Flow_Sum <= 1.62922e+08 )
									ret := 0.916667 // buy
								if( Positive_Money_Flow_Sum > 1.62922e+08 )
									ret := -0.500000
				if( Negative_Money_Flow_Sum > 6.64234e+07 )
					if( Money_Flow_Ratio <= 0.755215 )
						if( MFI <= 25.967 )
							if( Typical_Price <= 0.518239 )
								ret := 0.250000
							if( Typical_Price > 0.518239 )
								if( Raw_Money_Flow <= 2.76951e+06 )
									ret := -0.500000
								if( Raw_Money_Flow > 2.76951e+06 )
									ret := -0.971429 // sell
						if( MFI > 25.967 )
							if( Positive_Money_Flow <= 7.03723e+06 )
								if( Raw_Money_Flow <= 4.75044e+06 )
									ret := -0.333333
								if( Raw_Money_Flow > 4.75044e+06 )
									ret := 0.277778
							if( Positive_Money_Flow > 7.03723e+06 )
								if( bbp <= 0.00323 )
									ret := -0.928571 // sell
								if( bbp > 0.00323 )
									ret := 0.000000
					if( Money_Flow_Ratio > 0.755215 )
						if( Positive_Money_Flow_Sum <= 9.96277e+07 )
							if( Raw_Money_Flow <= 5.84502e+06 )
								if( bearPower <= -0.003926 )
									ret := -0.200000
								if( bearPower > -0.003926 )
									ret := -0.805556 // sell
							if( Raw_Money_Flow > 5.84502e+06 )
								if( bearPower <= -0.007362 )
									ret := -0.750000 // sell
								if( bearPower > -0.007362 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 9.96277e+07 )
							if( bearPower <= -0.003596 )
								if( Positive_Money_Flow <= 6.41933e+06 )
									ret := 0.416667
								if( Positive_Money_Flow > 6.41933e+06 )
									ret := -0.500000
							if( bearPower > -0.003596 )
								if( Raw_Money_Flow <= 6.32904e+06 )
									ret := -0.250000
								if( Raw_Money_Flow > 6.32904e+06 )
									ret := -1.000000 // sell
		if( bbp > 0.006003 )
			if( bearPower <= 0.036368 )
				if( Positive_Money_Flow_Sum <= 8.39513e+07 )
					if( Money_Flow_Ratio <= 25.161 )
						if( MFI_High <= -37.8098 )
							if( Positive_Money_Flow <= 1.38181e+07 )
								if( Positive_Money_Flow_Sum <= 1.49141e+07 )
									ret := 0.176471
								if( Positive_Money_Flow_Sum > 1.49141e+07 )
									ret := -0.514563
							if( Positive_Money_Flow > 1.38181e+07 )
								ret := 1.000000 // buy
						if( MFI_High > -37.8098 )
							if( MFI_High <= -35.2463 )
								if( Typical_Price <= 0.661577 )
									ret := 0.621622
								if( Typical_Price > 0.661577 )
									ret := -0.571429
							if( MFI_High > -35.2463 )
								if( Typical_Price <= 0.752504 )
									ret := -0.042667
								if( Typical_Price > 0.752504 )
									ret := 0.330000
					if( Money_Flow_Ratio > 25.161 )
						if( Raw_Money_Flow <= 4.28696e+06 )
							if( MFI_High <= 16.3941 )
								ret := -1.000000 // sell
							if( MFI_High > 16.3941 )
								ret := -0.250000
						if( Raw_Money_Flow > 4.28696e+06 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 8.39513e+07 )
					if( Positive_Money_Flow <= 28896.8 )
						if( Typical_Price <= 0.479217 )
							if( bbp <= 0.020268 )
								if( bbm <= 0.005579 )
									ret := 0.750000 // buy
								if( bbm > 0.005579 )
									ret := 0.000000
							if( bbp > 0.020268 )
								ret := 1.000000 // buy
						if( Typical_Price > 0.479217 )
							if( bearPower <= 0.011384 )
								if( bullPower <= 0.007613 )
									ret := 0.131579
								if( bullPower > 0.007613 )
									ret := -0.444444
							if( bearPower > 0.011384 )
								if( Money_Flow_Ratio <= 6.37069 )
									ret := 0.821429 // buy
								if( Money_Flow_Ratio > 6.37069 )
									ret := -0.666667
					if( Positive_Money_Flow > 28896.8 )
						if( Typical_Price <= 0.482966 )
							if( bearPower <= 0.004391 )
								if( Negative_Money_Flow_Sum <= 8.52971e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 8.52971e+07 )
									ret := -0.142857
							if( bearPower > 0.004391 )
								if( bearPower <= 0.012198 )
									ret := 0.925000 // buy
								if( bearPower > 0.012198 )
									ret := -0.153846
						if( Typical_Price > 0.482966 )
							if( Negative_Money_Flow_Sum <= 3.09713e+08 )
								if( Typical_Price <= 0.5863 )
									ret := -0.347561
								if( Typical_Price > 0.5863 )
									ret := -0.575758
							if( Negative_Money_Flow_Sum > 3.09713e+08 )
								ret := 1.000000 // buy
			if( bearPower > 0.036368 )
				if( MFI_High <= -3.58182 )
					ret := 0.000000
				if( MFI_High > -3.58182 )
					if( Raw_Money_Flow <= 1.26021e+08 )
						ret := 1.000000 // buy
					if( Raw_Money_Flow > 1.26021e+08 )
						ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_XRPUSDT_15Min_e2c703f1(bbp, bullPower, BBPower_Color, bearPower, bbm, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


