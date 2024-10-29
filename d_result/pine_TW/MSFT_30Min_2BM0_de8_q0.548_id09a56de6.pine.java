//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: MSFT_30Min_2BM0_09a56de6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_30Min_2BM0_09a56de6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_30Min_09a56de6(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 123611 )
		if( Raw_Money_Flow <= 2.81883e+06 )
			if( Typical_Price <= 86.9479 )
				if( Positive_Money_Flow_Sum <= 3.52386e+08 )
					if( bullPower <= -0.101072 )
						if( Negative_Money_Flow_Sum <= 9.6909e+08 )
							if( Positive_Money_Flow <= 31496 )
								if( bearPower <= -0.37869 )
									ret := 0.875000 // buy
								if( bearPower > -0.37869 )
									ret := 0.327684
							if( Positive_Money_Flow > 31496 )
								if( Money_Flow_Ratio <= 0.098116 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.098116 )
									ret := 0.931818 // buy
						if( Negative_Money_Flow_Sum > 9.6909e+08 )
							if( MFI_High <= -72.7932 )
								if( bullPower <= -0.274985 )
									ret := -1.000000 // sell
								if( bullPower > -0.274985 )
									ret := -0.181818
							if( MFI_High > -72.7932 )
								if( Typical_Price <= 54.5456 )
									ret := -0.157895
								if( Typical_Price > 54.5456 )
									ret := 0.466667
					if( bullPower > -0.101072 )
						if( Negative_Money_Flow_Sum <= 5.39748e+08 )
							if( Typical_Price <= 73.5416 )
								if( bbm <= 0.121239 )
									ret := 0.194118
								if( bbm > 0.121239 )
									ret := 0.634615
							if( Typical_Price > 73.5416 )
								if( Typical_Price <= 74.3969 )
									ret := -0.818182 // sell
								if( Typical_Price > 74.3969 )
									ret := 0.146341
						if( Negative_Money_Flow_Sum > 5.39748e+08 )
							if( Typical_Price <= 51.0983 )
								ret := 0.888889 // buy
							if( Typical_Price > 51.0983 )
								if( bullPower <= -0.000975 )
									ret := 0.184564
								if( bullPower > -0.000975 )
									ret := -0.299550
				if( Positive_Money_Flow_Sum > 3.52386e+08 )
					if( Negative_Money_Flow_Sum <= 8.29992e+08 )
						if( bearPower <= -0.343716 )
							if( bearPower <= -0.708631 )
								ret := 0.736842 // buy
							if( bearPower > -0.708631 )
								if( bearPower <= -0.512618 )
									ret := -0.037037
								if( bearPower > -0.512618 )
									ret := 0.605263
						if( bearPower > -0.343716 )
							if( bearPower <= 0.201312 )
								if( Negative_Money_Flow <= 90217.3 )
									ret := 0.048249
								if( Negative_Money_Flow > 90217.3 )
									ret := -0.193946
							if( bearPower > 0.201312 )
								if( Negative_Money_Flow_Sum <= 7.16018e+08 )
									ret := -0.408840
								if( Negative_Money_Flow_Sum > 7.16018e+08 )
									ret := 0.733333 // buy
					if( Negative_Money_Flow_Sum > 8.29992e+08 )
						if( Positive_Money_Flow_Sum <= 1.34045e+09 )
							if( Negative_Money_Flow <= 585291 )
								if( Positive_Money_Flow_Sum <= 4.59398e+08 )
									ret := -0.676471
								if( Positive_Money_Flow_Sum > 4.59398e+08 )
									ret := -0.106796
							if( Negative_Money_Flow > 585291 )
								if( MFI_Low <= 7.91729 )
									ret := -0.083333
								if( MFI_Low > 7.91729 )
									ret := 0.842105 // buy
						if( Positive_Money_Flow_Sum > 1.34045e+09 )
							if( Positive_Money_Flow <= 15002.1 )
								if( Money_Flow_Ratio <= 1.49985 )
									ret := -0.269231
								if( Money_Flow_Ratio > 1.49985 )
									ret := -0.700000 // sell
							if( Positive_Money_Flow > 15002.1 )
								ret := -1.000000 // sell
			if( Typical_Price > 86.9479 )
				if( bbp <= 0.067263 )
					if( Typical_Price <= 232.658 )
						if( Positive_Money_Flow_Sum <= 4.27732e+09 )
							if( Negative_Money_Flow_Sum <= 9.78998e+06 )
								if( Negative_Money_Flow_Sum <= 4.55406e+06 )
									ret := 0.177665
								if( Negative_Money_Flow_Sum > 4.55406e+06 )
									ret := -0.309524
							if( Negative_Money_Flow_Sum > 9.78998e+06 )
								if( Negative_Money_Flow_Sum <= 1.52888e+07 )
									ret := 0.743590 // buy
								if( Negative_Money_Flow_Sum > 1.52888e+07 )
									ret := 0.232558
						if( Positive_Money_Flow_Sum > 4.27732e+09 )
							if( Positive_Money_Flow_Sum <= 4.96131e+09 )
								if( bbm <= 0.622175 )
									ret := -0.181818
								if( bbm > 0.622175 )
									ret := -0.866667 // sell
							if( Positive_Money_Flow_Sum > 4.96131e+09 )
								if( bbm <= 0.461669 )
									ret := -0.533333
								if( bbm > 0.461669 )
									ret := 0.307692
					if( Typical_Price > 232.658 )
						if( MFI_High <= -66.8094 )
							if( bullPower <= -0.867612 )
								if( Money_Flow_Ratio <= 0.023143 )
									ret := 0.578947
								if( Money_Flow_Ratio > 0.023143 )
									ret := 0.058824
							if( bullPower > -0.867612 )
								if( Typical_Price <= 280.828 )
									ret := -0.429907
								if( Typical_Price > 280.828 )
									ret := -0.134078
						if( MFI_High > -66.8094 )
							if( bearPower <= -0.743953 )
								if( Negative_Money_Flow <= 2.55998e+06 )
									ret := 0.190551
								if( Negative_Money_Flow > 2.55998e+06 )
									ret := 0.609756
							if( bearPower > -0.743953 )
								if( Positive_Money_Flow_Sum <= 1.4335e+07 )
									ret := 0.397436
								if( Positive_Money_Flow_Sum > 1.4335e+07 )
									ret := 0.070968
				if( bbp > 0.067263 )
					if( MFI_Low <= -18.4177 )
						if( bbm <= 0.481242 )
							if( bullPower <= 0.738185 )
								if( MFI_High <= -79.9051 )
									ret := -0.615385
								if( MFI_High > -79.9051 )
									ret := -0.216561
							if( bullPower > 0.738185 )
								if( Positive_Money_Flow_Sum <= 8.27404e+06 )
									ret := 0.600000
								if( Positive_Money_Flow_Sum > 8.27404e+06 )
									ret := -0.176471
						if( bbm > 0.481242 )
							if( bbp <= 2.26002 )
								if( bearPower <= 0.012726 )
									ret := -0.636364
								if( bearPower > 0.012726 )
									ret := -0.444444
							if( bbp > 2.26002 )
								ret := -1.000000 // sell
					if( MFI_Low > -18.4177 )
						if( Negative_Money_Flow <= 2.07435e+06 )
							if( MFI <= 40.5191 )
								if( BBPower_Color <= 0.5 )
									ret := -0.380282
								if( BBPower_Color > 0.5 )
									ret := -0.019824
							if( MFI > 40.5191 )
								if( MFI_Low <= 58.3177 )
									ret := 0.145000
								if( MFI_Low > 58.3177 )
									ret := -0.012143
						if( Negative_Money_Flow > 2.07435e+06 )
							if( Negative_Money_Flow_Sum <= 1.96706e+07 )
								if( MFI <= 62.3411 )
									ret := 0.805825 // buy
								if( MFI > 62.3411 )
									ret := 0.180000
							if( Negative_Money_Flow_Sum > 1.96706e+07 )
								if( Negative_Money_Flow_Sum <= 6.24328e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 6.24328e+07 )
									ret := 0.165109
		if( Raw_Money_Flow > 2.81883e+06 )
			if( Negative_Money_Flow_Sum <= 2.81251e+07 )
				if( MFI_Low <= 78.1501 )
					if( Positive_Money_Flow_Sum <= 2.31357e+07 )
						if( Negative_Money_Flow_Sum <= 1.23274e+07 )
							if( Typical_Price <= 303.849 )
								if( MFI_Low <= 1.96454 )
									ret := 0.535714
								if( MFI_Low > 1.96454 )
									ret := -0.347826
							if( Typical_Price > 303.849 )
								if( bbm <= 0.676405 )
									ret := 0.800000 // buy
								if( bbm > 0.676405 )
									ret := 0.200000
						if( Negative_Money_Flow_Sum > 1.23274e+07 )
							if( bullPower <= 0.221008 )
								if( Positive_Money_Flow_Sum <= 1.89477e+07 )
									ret := -0.261194
								if( Positive_Money_Flow_Sum > 1.89477e+07 )
									ret := 0.240000
							if( bullPower > 0.221008 )
								if( Positive_Money_Flow_Sum <= 6.22944e+06 )
									ret := 0.341935
								if( Positive_Money_Flow_Sum > 6.22944e+06 )
									ret := 0.078431
					if( Positive_Money_Flow_Sum > 2.31357e+07 )
						if( Positive_Money_Flow_Sum <= 4.944e+07 )
							if( bbm <= 0.598007 )
								if( Negative_Money_Flow <= 1.10995e+07 )
									ret := -0.369565
								if( Negative_Money_Flow > 1.10995e+07 )
									ret := 0.636364
							if( bbm > 0.598007 )
								if( MFI <= 49.8357 )
									ret := 0.000000
								if( MFI > 49.8357 )
									ret := -0.572614
						if( Positive_Money_Flow_Sum > 4.944e+07 )
							if( Money_Flow_Ratio <= 3.41897 )
								if( bbm <= 0.536648 )
									ret := -0.055556
								if( bbm > 0.536648 )
									ret := 0.857143 // buy
							if( Money_Flow_Ratio > 3.41897 )
								if( bullPower <= 0.235917 )
									ret := -0.666667
								if( bullPower > 0.235917 )
									ret := -0.175000
				if( MFI_Low > 78.1501 )
					if( MFI_High <= 19.7196 )
						if( Typical_Price <= 297.82 )
							if( Typical_Price <= 230.453 )
								if( bullPower <= -0.336129 )
									ret := -0.444444
								if( bullPower > -0.336129 )
									ret := 0.557377
							if( Typical_Price > 230.453 )
								if( bbp <= -0.247252 )
									ret := -0.577778
								if( bbp > -0.247252 )
									ret := 0.500000
						if( Typical_Price > 297.82 )
							if( bullPower <= 0.531515 )
								if( bullPower <= -0.017431 )
									ret := 0.600000
								if( bullPower > -0.017431 )
									ret := 1.000000 // buy
							if( bullPower > 0.531515 )
								ret := 0.384615
					if( MFI_High > 19.7196 )
						if( Typical_Price <= 242.286 )
							ret := -0.100000
						if( Typical_Price > 242.286 )
							ret := -0.700000 // sell
			if( Negative_Money_Flow_Sum > 2.81251e+07 )
				if( Negative_Money_Flow_Sum <= 3.38857e+09 )
					if( Money_Flow_Ratio <= 0.109357 )
						if( Negative_Money_Flow <= 2.84918e+09 )
							if( bullPower <= 1.11688 )
								if( bearPower <= -4.85288 )
									ret := -0.389610
								if( bearPower > -4.85288 )
									ret := -0.059915
							if( bullPower > 1.11688 )
								if( Typical_Price <= 248.232 )
									ret := 0.426471
								if( Typical_Price > 248.232 )
									ret := -0.100890
						if( Negative_Money_Flow > 2.84918e+09 )
							if( bullPower <= -0.130521 )
								ret := 1.000000 // buy
							if( bullPower > -0.130521 )
								ret := 0.750000 // buy
					if( Money_Flow_Ratio > 0.109357 )
						if( Negative_Money_Flow_Sum <= 5.05105e+08 )
							if( Positive_Money_Flow_Sum <= 1.54021e+09 )
								if( MFI_High <= -14.2106 )
									ret := -0.036403
								if( MFI_High > -14.2106 )
									ret := 0.104579
							if( Positive_Money_Flow_Sum > 1.54021e+09 )
								if( Negative_Money_Flow <= 5.05934e+07 )
									ret := 0.016779
								if( Negative_Money_Flow > 5.05934e+07 )
									ret := -0.294849
						if( Negative_Money_Flow_Sum > 5.05105e+08 )
							if( Positive_Money_Flow_Sum <= 4.4477e+09 )
								if( Negative_Money_Flow <= 8.14334e+07 )
									ret := 0.196486
								if( Negative_Money_Flow > 8.14334e+07 )
									ret := 0.041883
							if( Positive_Money_Flow_Sum > 4.4477e+09 )
								if( MFI_Low <= 64.4884 )
									ret := 0.277228
								if( MFI_Low > 64.4884 )
									ret := -0.021053
				if( Negative_Money_Flow_Sum > 3.38857e+09 )
					if( bullPower <= -1.7777 )
						if( bullPower <= -4.22081 )
							if( MFI_Low <= -18.6957 )
								if( bbm <= 1.65811 )
									ret := -0.125000
								if( bbm > 1.65811 )
									ret := 0.666667
							if( MFI_Low > -18.6957 )
								if( Negative_Money_Flow <= 9.91883e+07 )
									ret := 0.818182 // buy
								if( Negative_Money_Flow > 9.91883e+07 )
									ret := 1.000000 // buy
						if( bullPower > -4.22081 )
							if( Negative_Money_Flow <= 4.62548e+08 )
								if( Typical_Price <= 209.119 )
									ret := 0.642857
								if( Typical_Price > 209.119 )
									ret := 0.190883
							if( Negative_Money_Flow > 4.62548e+08 )
								if( MFI_High <= -71.688 )
									ret := 0.153061
								if( MFI_High > -71.688 )
									ret := -0.325301
					if( bullPower > -1.7777 )
						if( Negative_Money_Flow <= 1.05372e+09 )
							if( Negative_Money_Flow <= 4.04772e+08 )
								if( Negative_Money_Flow_Sum <= 4.42092e+09 )
									ret := -0.217245
								if( Negative_Money_Flow_Sum > 4.42092e+09 )
									ret := 0.053521
							if( Negative_Money_Flow > 4.04772e+08 )
								if( Money_Flow_Ratio <= 0.735385 )
									ret := -0.140260
								if( Money_Flow_Ratio > 0.735385 )
									ret := -0.556962
						if( Negative_Money_Flow > 1.05372e+09 )
							if( MFI_Low <= 26.3287 )
								if( Positive_Money_Flow_Sum <= 5.11537e+09 )
									ret := -0.015123
								if( Positive_Money_Flow_Sum > 5.11537e+09 )
									ret := -0.774194 // sell
							if( MFI_Low > 26.3287 )
								if( Negative_Money_Flow_Sum <= 4.25109e+09 )
									ret := 0.260274
								if( Negative_Money_Flow_Sum > 4.25109e+09 )
									ret := 0.662651
	if( Positive_Money_Flow > 123611 )
		if( bullPower <= -0.220084 )
			if( MFI_Low <= -18.7044 )
				if( MFI <= 0.42477 )
					if( bearPower <= -2.11659 )
						ret := 0.866667 // buy
					if( bearPower > -2.11659 )
						if( Money_Flow_Ratio <= 0.002083 )
							if( bearPower <= -0.580114 )
								if( Negative_Money_Flow_Sum <= 2.12823e+09 )
									ret := 0.230769
								if( Negative_Money_Flow_Sum > 2.12823e+09 )
									ret := -0.125000
							if( bearPower > -0.580114 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.002083 )
							if( Positive_Money_Flow_Sum <= 2.21009e+07 )
								if( MFI_Low <= -19.608 )
									ret := -0.423077
								if( MFI_Low > -19.608 )
									ret := 0.100000
							if( Positive_Money_Flow_Sum > 2.21009e+07 )
								ret := 0.500000
				if( MFI > 0.42477 )
					if( Negative_Money_Flow <= 21152.3 )
						if( Typical_Price <= 278.033 )
							if( Typical_Price <= 191.25 )
								if( bbm <= 0.283493 )
									ret := 0.666667
								if( bbm > 0.283493 )
									ret := 1.000000 // buy
							if( Typical_Price > 191.25 )
								if( Raw_Money_Flow <= 523473 )
									ret := 0.812500 // buy
								if( Raw_Money_Flow > 523473 )
									ret := 0.314286
						if( Typical_Price > 278.033 )
							ret := -0.157895
					if( Negative_Money_Flow > 21152.3 )
						if( Typical_Price <= 290.796 )
							if( Positive_Money_Flow_Sum <= 3.95884e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.95884e+07 )
								ret := 0.666667
						if( Typical_Price > 290.796 )
							ret := 0.263158
			if( MFI_Low > -18.7044 )
				if( Raw_Money_Flow <= 3.01924e+08 )
					if( Typical_Price <= 283.371 )
						if( MFI_Low <= -13.55 )
							if( bbp <= -2.45631 )
								if( Negative_Money_Flow_Sum <= 6.63139e+09 )
									ret := -0.272727
								if( Negative_Money_Flow_Sum > 6.63139e+09 )
									ret := -0.846154 // sell
							if( bbp > -2.45631 )
								if( MFI <= 6.12836 )
									ret := -0.163636
								if( MFI > 6.12836 )
									ret := -0.875000 // sell
						if( MFI_Low > -13.55 )
							if( Negative_Money_Flow <= 3074.96 )
								if( MFI <= 43.3161 )
									ret := 0.048640
								if( MFI > 43.3161 )
									ret := 0.234818
							if( Negative_Money_Flow > 3074.96 )
								if( bearPower <= -4.67041 )
									ret := 1.000000 // buy
								if( bearPower > -4.67041 )
									ret := 0.380030
					if( Typical_Price > 283.371 )
						if( bbm <= 0.910436 )
							if( MFI_High <= -45.4405 )
								if( bullPower <= -2.41785 )
									ret := 0.480000
								if( bullPower > -2.41785 )
									ret := 0.032995
							if( MFI_High > -45.4405 )
								if( MFI <= 61.7216 )
									ret := -0.334764
								if( MFI > 61.7216 )
									ret := 0.022059
						if( bbm > 0.910436 )
							if( bbp <= -1.77159 )
								if( Negative_Money_Flow <= 2.74745e+07 )
									ret := 0.148438
								if( Negative_Money_Flow > 2.74745e+07 )
									ret := 0.866667 // buy
							if( bbp > -1.77159 )
								if( Typical_Price <= 370.501 )
									ret := 0.937500 // buy
								if( Typical_Price > 370.501 )
									ret := 0.500000
				if( Raw_Money_Flow > 3.01924e+08 )
					if( Negative_Money_Flow_Sum <= 6.61647e+09 )
						if( Raw_Money_Flow <= 3.71335e+08 )
							if( MFI_High <= -44.8653 )
								if( MFI_High <= -57.4183 )
									ret := -0.398305
								if( MFI_High > -57.4183 )
									ret := -0.734694 // sell
							if( MFI_High > -44.8653 )
								if( bullPower <= -0.754683 )
									ret := 0.384615
								if( bullPower > -0.754683 )
									ret := -0.268293
						if( Raw_Money_Flow > 3.71335e+08 )
							if( Typical_Price <= 158.496 )
								if( MFI <= 36.3436 )
									ret := -0.823529 // sell
								if( MFI > 36.3436 )
									ret := 0.111111
							if( Typical_Price > 158.496 )
								if( Negative_Money_Flow_Sum <= 1.91934e+09 )
									ret := 0.422360
								if( Negative_Money_Flow_Sum > 1.91934e+09 )
									ret := -0.092063
					if( Negative_Money_Flow_Sum > 6.61647e+09 )
						if( MFI_High <= -62.9745 )
							if( Positive_Money_Flow <= 5.01363e+08 )
								ret := 0.875000 // buy
							if( Positive_Money_Flow > 5.01363e+08 )
								ret := 1.000000 // buy
						if( MFI_High > -62.9745 )
							if( Positive_Money_Flow <= 9.3516e+08 )
								ret := 0.714286 // buy
							if( Positive_Money_Flow > 9.3516e+08 )
								ret := 0.200000
		if( bullPower > -0.220084 )
			if( MFI_Low <= 74.0508 )
				if( MFI_High <= -41.5595 )
					if( Negative_Money_Flow_Sum <= 6.90931e+09 )
						if( Positive_Money_Flow <= 2.80323e+08 )
							if( Raw_Money_Flow <= 2.77251e+06 )
								if( bearPower <= -0.246054 )
									ret := 0.003958
								if( bearPower > -0.246054 )
									ret := -0.159149
							if( Raw_Money_Flow > 2.77251e+06 )
								if( bullPower <= -0.142945 )
									ret := -0.244526
								if( bullPower > -0.142945 )
									ret := 0.016233
						if( Positive_Money_Flow > 2.80323e+08 )
							if( bbp <= 0.820003 )
								if( Positive_Money_Flow <= 4.86408e+08 )
									ret := -0.167183
								if( Positive_Money_Flow > 4.86408e+08 )
									ret := -0.391691
							if( bbp > 0.820003 )
								if( bbm <= 2.71117 )
									ret := 0.500000
								if( bbm > 2.71117 )
									ret := -0.916667 // sell
					if( Negative_Money_Flow_Sum > 6.90931e+09 )
						if( MFI <= 18.2226 )
							if( Negative_Money_Flow_Sum <= 1.87574e+10 )
								if( Typical_Price <= 358.481 )
									ret := -0.978723 // sell
								if( Typical_Price > 358.481 )
									ret := -0.777778 // sell
							if( Negative_Money_Flow_Sum > 1.87574e+10 )
								ret := -0.500000
						if( MFI > 18.2226 )
							if( Raw_Money_Flow <= 1.18282e+09 )
								if( Money_Flow_Ratio <= 0.486766 )
									ret := -0.654545
								if( Money_Flow_Ratio > 0.486766 )
									ret := -0.142857
							if( Raw_Money_Flow > 1.18282e+09 )
								ret := 0.833333 // buy
				if( MFI_High > -41.5595 )
					if( Positive_Money_Flow <= 1.2913e+08 )
						if( bullPower <= 1.9316 )
							if( Positive_Money_Flow <= 2.15607e+06 )
								if( MFI_High <= -40.8656 )
									ret := 0.284314
								if( MFI_High > -40.8656 )
									ret := -0.104506
							if( Positive_Money_Flow > 2.15607e+06 )
								if( Positive_Money_Flow_Sum <= 2.65661e+09 )
									ret := -0.046438
								if( Positive_Money_Flow_Sum > 2.65661e+09 )
									ret := 0.098431
						if( bullPower > 1.9316 )
							if( Raw_Money_Flow <= 1.473e+07 )
								if( Money_Flow_Ratio <= 1.10478 )
									ret := -0.695122
								if( Money_Flow_Ratio > 1.10478 )
									ret := -0.251765
							if( Raw_Money_Flow > 1.473e+07 )
								if( Negative_Money_Flow <= 618290 )
									ret := -0.023495
								if( Negative_Money_Flow > 618290 )
									ret := -0.490196
					if( Positive_Money_Flow > 1.2913e+08 )
						if( Positive_Money_Flow <= 1.17223e+09 )
							if( bullPower <= 3.58827 )
								if( Positive_Money_Flow_Sum <= 3.50427e+08 )
									ret := -0.344262
								if( Positive_Money_Flow_Sum > 3.50427e+08 )
									ret := 0.105458
							if( bullPower > 3.58827 )
								if( Raw_Money_Flow <= 1.843e+08 )
									ret := 0.571429
								if( Raw_Money_Flow > 1.843e+08 )
									ret := -0.174142
						if( Positive_Money_Flow > 1.17223e+09 )
							if( bearPower <= -1.40207 )
								if( Money_Flow_Ratio <= 3.70548 )
									ret := -0.510417
								if( Money_Flow_Ratio > 3.70548 )
									ret := -0.060241
							if( bearPower > -1.40207 )
								if( Typical_Price <= 177.646 )
									ret := 0.274725
								if( Typical_Price > 177.646 )
									ret := -0.100394
			if( MFI_Low > 74.0508 )
				if( Raw_Money_Flow <= 9.32343e+07 )
					if( Negative_Money_Flow <= 87321.4 )
						if( bbp <= 1.37461 )
							if( bbp <= 0.624781 )
								if( bbm <= 1.09783 )
									ret := -0.280959
								if( bbm > 1.09783 )
									ret := 0.236842
							if( bbp > 0.624781 )
								if( bbp <= 0.698226 )
									ret := 0.456790
								if( bbp > 0.698226 )
									ret := -0.112045
						if( bbp > 1.37461 )
							if( bbm <= 0.485 )
								if( Positive_Money_Flow <= 1.24369e+06 )
									ret := -0.020408
								if( Positive_Money_Flow > 1.24369e+06 )
									ret := -0.450000
							if( bbm > 0.485 )
								if( bbp <= 3.93192 )
									ret := -0.623656
								if( bbp > 3.93192 )
									ret := -0.200000
					if( Negative_Money_Flow > 87321.4 )
						if( Negative_Money_Flow_Sum <= 2.32981e+06 )
							if( Negative_Money_Flow <= 416634 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow > 416634 )
								ret := -0.777778 // sell
						if( Negative_Money_Flow_Sum > 2.32981e+06 )
							if( Money_Flow_Ratio <= 492.544 )
								if( Raw_Money_Flow <= 3.75651e+06 )
									ret := -0.565543
								if( Raw_Money_Flow > 3.75651e+06 )
									ret := -0.333333
							if( Money_Flow_Ratio > 492.544 )
								if( MFI <= 99.8571 )
									ret := 0.435897
								if( MFI > 99.8571 )
									ret := -0.875000 // sell
				if( Raw_Money_Flow > 9.32343e+07 )
					if( Raw_Money_Flow <= 3.80418e+08 )
						if( Money_Flow_Ratio <= 655.004 )
							if( Typical_Price <= 350.434 )
								if( bbm <= 1.36665 )
									ret := 0.053827
								if( bbm > 1.36665 )
									ret := 0.433628
							if( Typical_Price > 350.434 )
								if( bearPower <= 0.282533 )
									ret := 0.222222
								if( bearPower > 0.282533 )
									ret := -0.600000
						if( Money_Flow_Ratio > 655.004 )
							if( Positive_Money_Flow <= 1.01763e+08 )
								if( MFI <= 99.9208 )
									ret := 0.571429
								if( MFI > 99.9208 )
									ret := -0.307692
							if( Positive_Money_Flow > 1.01763e+08 )
								if( Positive_Money_Flow_Sum <= 6.2271e+08 )
									ret := 0.965517 // buy
								if( Positive_Money_Flow_Sum > 6.2271e+08 )
									ret := 0.315789
					if( Raw_Money_Flow > 3.80418e+08 )
						if( Positive_Money_Flow <= 1.55132e+09 )
							if( MFI_Low <= 78.4884 )
								if( Money_Flow_Ratio <= 85.556 )
									ret := -0.204348
								if( Money_Flow_Ratio > 85.556 )
									ret := -0.675000
							if( MFI_Low > 78.4884 )
								if( bbp <= 1.83105 )
									ret := -0.285714
								if( bbp > 1.83105 )
									ret := 0.101786
						if( Positive_Money_Flow > 1.55132e+09 )
							if( bbp <= 8.1301 )
								if( Negative_Money_Flow_Sum <= 6.81147e+07 )
									ret := 0.628099
								if( Negative_Money_Flow_Sum > 6.81147e+07 )
									ret := -0.016949
							if( bbp > 8.1301 )
								ret := -0.923077 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MSFT_30Min_09a56de6(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


