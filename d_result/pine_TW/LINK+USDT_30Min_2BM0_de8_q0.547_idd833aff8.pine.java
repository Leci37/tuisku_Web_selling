//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: LINKUSDT_30Min_2BM0_d833aff8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_2BM0_d833aff8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_d833aff8(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= -0.431647 )
		if( Raw_Money_Flow <= 2.23229e+07 )
			if( Typical_Price <= 26.8097 )
				if( Positive_Money_Flow_Sum <= 2.08145e+07 )
					if( bullPower <= -0.361156 )
						if( Negative_Money_Flow_Sum <= 8.42294e+07 )
							if( MFI_Low <= -6.57171 )
								if( bearPower <= -0.666065 )
									ret := -0.670391
								if( bearPower > -0.666065 )
									ret := 0.333333
							if( MFI_Low > -6.57171 )
								if( Money_Flow_Ratio <= 0.548494 )
									ret := -0.068182
								if( Money_Flow_Ratio > 0.548494 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 8.42294e+07 )
							if( MFI_High <= -65.7453 )
								if( bullPower <= -0.891563 )
									ret := 0.466667
								if( bullPower > -0.891563 )
									ret := 0.930233 // buy
							if( MFI_High > -65.7453 )
								if( Positive_Money_Flow_Sum <= 1.67444e+07 )
									ret := -0.117647
								if( Positive_Money_Flow_Sum > 1.67444e+07 )
									ret := 0.777778 // buy
					if( bullPower > -0.361156 )
						if( Negative_Money_Flow_Sum <= 5.91443e+07 )
							if( Typical_Price <= 17.9589 )
								if( bbm <= 0.502857 )
									ret := 0.262045
								if( bbm > 0.502857 )
									ret := 0.605882
							if( Typical_Price > 17.9589 )
								if( MFI_High <= -54.3434 )
									ret := 0.302120
								if( MFI_High > -54.3434 )
									ret := -0.015213
						if( Negative_Money_Flow_Sum > 5.91443e+07 )
							if( Typical_Price <= 19.7117 )
								if( Raw_Money_Flow <= 6.47719e+06 )
									ret := 0.666667
								if( Raw_Money_Flow > 6.47719e+06 )
									ret := -0.368421
							if( Typical_Price > 19.7117 )
								if( Negative_Money_Flow_Sum <= 6.09731e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 6.09731e+07 )
									ret := -0.705882 // sell
				if( Positive_Money_Flow_Sum > 2.08145e+07 )
					if( bearPower <= -0.564009 )
						if( Money_Flow_Ratio <= 0.529776 )
							if( MFI <= 16.1506 )
								ret := -1.000000 // sell
							if( MFI > 16.1506 )
								if( Positive_Money_Flow <= 4.64293e+06 )
									ret := 0.651948
								if( Positive_Money_Flow > 4.64293e+06 )
									ret := 0.353293
						if( Money_Flow_Ratio > 0.529776 )
							if( Negative_Money_Flow <= 4.54373e+06 )
								if( Negative_Money_Flow_Sum <= 1.03911e+08 )
									ret := 0.302260
								if( Negative_Money_Flow_Sum > 1.03911e+08 )
									ret := 0.893617 // buy
							if( Negative_Money_Flow > 4.54373e+06 )
								if( Typical_Price <= 20.2321 )
									ret := -0.229730
								if( Typical_Price > 20.2321 )
									ret := 0.227666
					if( bearPower > -0.564009 )
						if( Negative_Money_Flow <= 1.15677e+06 )
							if( bearPower <= -0.511778 )
								if( MFI_Low <= 14.3741 )
									ret := 0.312500
								if( MFI_Low > 14.3741 )
									ret := -0.450704
							if( bearPower > -0.511778 )
								if( bearPower <= -0.47022 )
									ret := 0.475610
								if( bearPower > -0.47022 )
									ret := -0.173228
						if( Negative_Money_Flow > 1.15677e+06 )
							if( Money_Flow_Ratio <= 0.400567 )
								if( bbp <= -0.646083 )
									ret := 0.333333
								if( bbp > -0.646083 )
									ret := -0.925926 // sell
							if( Money_Flow_Ratio > 0.400567 )
								if( Typical_Price <= 14.691 )
									ret := -0.050000
								if( Typical_Price > 14.691 )
									ret := 0.417284
			if( Typical_Price > 26.8097 )
				if( Positive_Money_Flow_Sum <= 4.54394e+07 )
					if( Negative_Money_Flow_Sum <= 3.88262e+07 )
						if( Negative_Money_Flow_Sum <= 3.81111e+07 )
							if( Positive_Money_Flow <= 2.68611e+06 )
								if( Positive_Money_Flow_Sum <= 4.72968e+06 )
									ret := -0.916667 // sell
								if( Positive_Money_Flow_Sum > 4.72968e+06 )
									ret := 0.199683
							if( Positive_Money_Flow > 2.68611e+06 )
								if( Positive_Money_Flow <= 5.19667e+06 )
									ret := -0.398438
								if( Positive_Money_Flow > 5.19667e+06 )
									ret := 0.826087 // buy
						if( Negative_Money_Flow_Sum > 3.81111e+07 )
							if( Money_Flow_Ratio <= 0.860968 )
								ret := 0.571429
							if( Money_Flow_Ratio > 0.860968 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 3.88262e+07 )
						if( MFI_High <= -49.7333 )
							if( bearPower <= -0.666266 )
								if( MFI_Low <= -6.85937 )
									ret := -0.431373
								if( MFI_Low > -6.85937 )
									ret := 0.146868
							if( bearPower > -0.666266 )
								if( bbm <= 0.258295 )
									ret := -0.962963 // sell
								if( bbm > 0.258295 )
									ret := -0.114865
						if( MFI_High > -49.7333 )
							if( bearPower <= -1.91471 )
								if( Typical_Price <= 41.1734 )
									ret := 0.500000
								if( Typical_Price > 41.1734 )
									ret := 0.800000 // buy
							if( bearPower > -1.91471 )
								if( Negative_Money_Flow <= 1.24496e+07 )
									ret := -0.434524
								if( Negative_Money_Flow > 1.24496e+07 )
									ret := 0.513514
				if( Positive_Money_Flow_Sum > 4.54394e+07 )
					if( Money_Flow_Ratio <= 0.626841 )
						if( MFI_High <= -46.335 )
							if( bearPower <= -1.0915 )
								if( Positive_Money_Flow <= 9.11823e+06 )
									ret := 0.182796
								if( Positive_Money_Flow > 9.11823e+06 )
									ret := -0.836364 // sell
							if( bearPower > -1.0915 )
								if( Raw_Money_Flow <= 9.12107e+06 )
									ret := 0.333333
								if( Raw_Money_Flow > 9.12107e+06 )
									ret := 1.000000 // buy
						if( MFI_High > -46.335 )
							if( Positive_Money_Flow_Sum <= 4.96912e+07 )
								if( Negative_Money_Flow <= 8.13163e+06 )
									ret := 0.666667
								if( Negative_Money_Flow > 8.13163e+06 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 4.96912e+07 )
								if( bearPower <= -0.686871 )
									ret := -0.791667 // sell
								if( bearPower > -0.686871 )
									ret := 0.363636
					if( Money_Flow_Ratio > 0.626841 )
						if( bearPower <= -0.95525 )
							if( Positive_Money_Flow <= 1.13971e+07 )
								if( bullPower <= -0.608636 )
									ret := -0.307692
								if( bullPower > -0.608636 )
									ret := 0.711009 // buy
							if( Positive_Money_Flow > 1.13971e+07 )
								ret := -0.375000
						if( bearPower > -0.95525 )
							if( Negative_Money_Flow_Sum <= 1.18091e+08 )
								if( Positive_Money_Flow <= 5.88807e+06 )
									ret := 0.372168
								if( Positive_Money_Flow > 5.88807e+06 )
									ret := -0.031250
							if( Negative_Money_Flow_Sum > 1.18091e+08 )
								if( bbp <= -0.472568 )
									ret := -0.454545
								if( bbp > -0.472568 )
									ret := -0.750000 // sell
		if( Raw_Money_Flow > 2.23229e+07 )
			if( Negative_Money_Flow_Sum <= 1.12271e+08 )
				if( bearPower <= -2.40506 )
					if( bearPower <= -4.07688 )
						ret := 0.250000
					if( bearPower > -4.07688 )
						if( Raw_Money_Flow <= 2.33485e+07 )
							ret := 0.600000
						if( Raw_Money_Flow > 2.33485e+07 )
							if( MFI_High <= -62.2997 )
								ret := 1.000000 // buy
							if( MFI_High > -62.2997 )
								ret := 0.833333 // buy
				if( bearPower > -2.40506 )
					if( Negative_Money_Flow_Sum <= 6.30884e+07 )
						ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 6.30884e+07 )
						if( Raw_Money_Flow <= 2.36036e+07 )
							ret := 0.214286
						if( Raw_Money_Flow > 2.36036e+07 )
							if( bbm <= 1.6729 )
								if( Positive_Money_Flow_Sum <= 6.31347e+07 )
									ret := -0.785714 // sell
								if( Positive_Money_Flow_Sum > 6.31347e+07 )
									ret := 0.000000
							if( bbm > 1.6729 )
								ret := 0.714286 // buy
			if( Negative_Money_Flow_Sum > 1.12271e+08 )
				if( bbp <= -0.175645 )
					if( Negative_Money_Flow <= 3.25475e+07 )
						if( Money_Flow_Ratio <= 0.460953 )
							if( bbp <= -4.57659 )
								ret := 1.000000 // buy
							if( bbp > -4.57659 )
								if( MFI <= 29.0919 )
									ret := 0.289474
								if( MFI > 29.0919 )
									ret := 0.625000
						if( Money_Flow_Ratio > 0.460953 )
							if( bullPower <= -1.00308 )
								if( bbm <= 1.78935 )
									ret := -0.200000
								if( bbm > 1.78935 )
									ret := 1.000000 // buy
							if( bullPower > -1.00308 )
								if( bearPower <= -1.1162 )
									ret := 0.983607 // buy
								if( bearPower > -1.1162 )
									ret := 0.500000
					if( Negative_Money_Flow > 3.25475e+07 )
						if( MFI_High <= -55.1858 )
							ret := 1.000000 // buy
						if( MFI_High > -55.1858 )
							ret := 0.818182 // buy
				if( bbp > -0.175645 )
					if( Raw_Money_Flow <= 2.65044e+07 )
						ret := 0.875000 // buy
					if( Raw_Money_Flow > 2.65044e+07 )
						ret := -0.769231 // sell
	if( bearPower > -0.431647 )
		if( Negative_Money_Flow_Sum <= 3.6104e+07 )
			if( MFI <= 46.7239 )
				if( Negative_Money_Flow <= 1.48389e+06 )
					if( Typical_Price <= 7.18069 )
						if( Negative_Money_Flow_Sum <= 5.92918e+06 )
							if( MFI_Low <= 4.72134 )
								if( Money_Flow_Ratio <= 0.198894 )
									ret := 0.160377
								if( Money_Flow_Ratio > 0.198894 )
									ret := -0.209850
							if( MFI_Low > 4.72134 )
								if( Negative_Money_Flow <= 933519 )
									ret := 0.047285
								if( Negative_Money_Flow > 933519 )
									ret := -0.335878
						if( Negative_Money_Flow_Sum > 5.92918e+06 )
							if( bullPower <= 0.005117 )
								if( bbm <= 0.072379 )
									ret := -0.017706
								if( bbm > 0.072379 )
									ret := 0.214162
							if( bullPower > 0.005117 )
								if( MFI <= 28.7651 )
									ret := 0.019481
								if( MFI > 28.7651 )
									ret := 0.307097
					if( Typical_Price > 7.18069 )
						if( MFI_Low <= 4.17895 )
							if( Raw_Money_Flow <= 2.70955e+06 )
								if( MFI <= 19.2477 )
									ret := -0.079082
								if( MFI > 19.2477 )
									ret := 0.126044
							if( Raw_Money_Flow > 2.70955e+06 )
								if( bullPower <= -0.054286 )
									ret := 0.400000
								if( bullPower > -0.054286 )
									ret := 0.694444
						if( MFI_Low > 4.17895 )
							if( bullPower <= 0.017229 )
								if( Typical_Price <= 16.195 )
									ret := -0.109310
								if( Typical_Price > 16.195 )
									ret := -0.012926
							if( bullPower > 0.017229 )
								if( Raw_Money_Flow <= 1.96102e+06 )
									ret := 0.035334
								if( Raw_Money_Flow > 1.96102e+06 )
									ret := -0.096386
				if( Negative_Money_Flow > 1.48389e+06 )
					if( Typical_Price <= 18.2317 )
						if( Negative_Money_Flow_Sum <= 1.58747e+07 )
							if( bbp <= -0.25225 )
								if( Positive_Money_Flow_Sum <= 2.51162e+06 )
									ret := -0.198444
								if( Positive_Money_Flow_Sum > 2.51162e+06 )
									ret := 0.023944
							if( bbp > -0.25225 )
								if( MFI_Low <= 8.17262 )
									ret := 0.378378
								if( MFI_Low > 8.17262 )
									ret := 0.097587
						if( Negative_Money_Flow_Sum > 1.58747e+07 )
							if( Positive_Money_Flow_Sum <= 2.57559e+07 )
								if( Positive_Money_Flow_Sum <= 2.15367e+07 )
									ret := 0.211175
								if( Positive_Money_Flow_Sum > 2.15367e+07 )
									ret := 0.697143
							if( Positive_Money_Flow_Sum > 2.57559e+07 )
								if( Raw_Money_Flow <= 3.08818e+06 )
									ret := -0.250000
								if( Raw_Money_Flow > 3.08818e+06 )
									ret := -0.781250 // sell
					if( Typical_Price > 18.2317 )
						if( MFI_Low <= 9.43482 )
							if( Negative_Money_Flow_Sum <= 3.06759e+07 )
								if( Positive_Money_Flow_Sum <= 1.12769e+07 )
									ret := -0.241525
								if( Positive_Money_Flow_Sum > 1.12769e+07 )
									ret := -0.861111 // sell
							if( Negative_Money_Flow_Sum > 3.06759e+07 )
								if( Typical_Price <= 21.2819 )
									ret := 0.411765
								if( Typical_Price > 21.2819 )
									ret := -0.078431
						if( MFI_Low > 9.43482 )
							if( MFI <= 31.9776 )
								if( bbm <= 0.29123 )
									ret := 0.178218
								if( bbm > 0.29123 )
									ret := 0.631579
							if( MFI > 31.9776 )
								if( bbp <= -0.45987 )
									ret := -0.254438
								if( bbp > -0.45987 )
									ret := -0.005607
			if( MFI > 46.7239 )
				if( Positive_Money_Flow <= 2.10581e+06 )
					if( bullPower <= 0.033823 )
						if( bearPower <= -0.023674 )
							if( Negative_Money_Flow <= 2.65299e+06 )
								if( Raw_Money_Flow <= 2.33121e+06 )
									ret := -0.101544
								if( Raw_Money_Flow > 2.33121e+06 )
									ret := -0.413043
							if( Negative_Money_Flow > 2.65299e+06 )
								if( bullPower <= 0.030133 )
									ret := 0.154217
								if( bullPower > 0.030133 )
									ret := -0.833333 // sell
						if( bearPower > -0.023674 )
							if( Positive_Money_Flow <= 228287 )
								if( bbm <= 0.048259 )
									ret := 0.027214
								if( bbm > 0.048259 )
									ret := 0.342466
							if( Positive_Money_Flow > 228287 )
								if( Money_Flow_Ratio <= 0.893381 )
									ret := 0.440000
								if( Money_Flow_Ratio > 0.893381 )
									ret := -0.103501
					if( bullPower > 0.033823 )
						if( Raw_Money_Flow <= 4.36062e+06 )
							if( Negative_Money_Flow <= 3.48675e+06 )
								if( Typical_Price <= 7.15556 )
									ret := 0.130476
								if( Typical_Price > 7.15556 )
									ret := 0.001145
							if( Negative_Money_Flow > 3.48675e+06 )
								if( MFI_Low <= 31.0124 )
									ret := 0.276786
								if( MFI_Low > 31.0124 )
									ret := -0.206603
						if( Raw_Money_Flow > 4.36062e+06 )
							if( Negative_Money_Flow <= 7.96184e+06 )
								if( Typical_Price <= 9.13413 )
									ret := -0.416667
								if( Typical_Price > 9.13413 )
									ret := 0.283034
							if( Negative_Money_Flow > 7.96184e+06 )
								if( Negative_Money_Flow_Sum <= 1.84935e+07 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 1.84935e+07 )
									ret := -0.212766
				if( Positive_Money_Flow > 2.10581e+06 )
					if( MFI <= 79.3821 )
						if( bearPower <= -0.333844 )
							if( MFI_Low <= 28.1148 )
								if( Typical_Price <= 25.0697 )
									ret := 0.133333
								if( Typical_Price > 25.0697 )
									ret := 0.933333 // buy
							if( MFI_Low > 28.1148 )
								if( bullPower <= 0.278025 )
									ret := -0.008130
								if( bullPower > 0.278025 )
									ret := 0.733333 // buy
						if( bearPower > -0.333844 )
							if( Money_Flow_Ratio <= 3.37618 )
								if( Positive_Money_Flow_Sum <= 7.65928e+07 )
									ret := -0.053946
								if( Positive_Money_Flow_Sum > 7.65928e+07 )
									ret := -0.496241
							if( Money_Flow_Ratio > 3.37618 )
								if( MFI <= 78.4527 )
									ret := 0.328502
								if( MFI > 78.4527 )
									ret := 0.021201
					if( MFI > 79.3821 )
						if( bearPower <= 0.044389 )
							if( bbm <= 0.599608 )
								if( bullPower <= 0.262263 )
									ret := 0.533333
								if( bullPower > 0.262263 )
									ret := 0.030303
							if( bbm > 0.599608 )
								ret := 1.000000 // buy
						if( bearPower > 0.044389 )
							if( Negative_Money_Flow <= 281643 )
								if( bbm <= 0.320277 )
									ret := -0.128627
								if( bbm > 0.320277 )
									ret := -0.320828
							if( Negative_Money_Flow > 281643 )
								if( Negative_Money_Flow_Sum <= 2.18946e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 2.18946e+07 )
									ret := 0.166667
		if( Negative_Money_Flow_Sum > 3.6104e+07 )
			if( MFI_Low <= 33.4525 )
				if( MFI_High <= -29.1057 )
					if( Money_Flow_Ratio <= 0.947869 )
						if( Positive_Money_Flow <= 3.1062e+06 )
							if( Positive_Money_Flow_Sum <= 2.23411e+07 )
								if( Raw_Money_Flow <= 3.2691e+06 )
									ret := -0.041725
								if( Raw_Money_Flow > 3.2691e+06 )
									ret := 0.360324
							if( Positive_Money_Flow_Sum > 2.23411e+07 )
								if( Money_Flow_Ratio <= 0.456864 )
									ret := -0.572115
								if( Money_Flow_Ratio > 0.456864 )
									ret := -0.110340
						if( Positive_Money_Flow > 3.1062e+06 )
							if( bbm <= 0.17455 )
								if( bearPower <= -0.157628 )
									ret := 0.300000
								if( bearPower > -0.157628 )
									ret := 0.555556
							if( bbm > 0.17455 )
								if( MFI <= 36.6061 )
									ret := -0.520408
								if( MFI > 36.6061 )
									ret := -0.173913
					if( Money_Flow_Ratio > 0.947869 )
						if( bbm <= 0.455438 )
							if( Positive_Money_Flow_Sum <= 3.65239e+07 )
								if( Raw_Money_Flow <= 4.23465e+06 )
									ret := 0.692308
								if( Raw_Money_Flow > 4.23465e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.65239e+07 )
								if( bbp <= 0.39635 )
									ret := 0.351852
								if( bbp > 0.39635 )
									ret := -0.562500
						if( bbm > 0.455438 )
							if( bbm <= 0.890735 )
								if( Negative_Money_Flow_Sum <= 5.1072e+07 )
									ret := -0.483146
								if( Negative_Money_Flow_Sum > 5.1072e+07 )
									ret := 0.104478
							if( bbm > 0.890735 )
								if( Raw_Money_Flow <= 1.56337e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 1.56337e+07 )
									ret := -0.250000
				if( MFI_High > -29.1057 )
					if( bearPower <= -0.367602 )
						if( MFI_Low <= 31.7051 )
							ret := -0.066667
						if( MFI_Low > 31.7051 )
							if( bearPower <= -0.401354 )
								ret := 0.714286 // buy
							if( bearPower > -0.401354 )
								ret := 0.466667
					if( bearPower > -0.367602 )
						if( bbp <= -0.32237 )
							ret := 0.304348
						if( bbp > -0.32237 )
							if( bullPower <= 0.24572 )
								if( Money_Flow_Ratio <= 1.11739 )
									ret := -0.845455 // sell
								if( Money_Flow_Ratio > 1.11739 )
									ret := -0.210526
							if( bullPower > 0.24572 )
								if( bearPower <= -0.0489 )
									ret := -0.174242
								if( bearPower > -0.0489 )
									ret := -0.580645
			if( MFI_Low > 33.4525 )
				if( Money_Flow_Ratio <= 1.27798 )
					if( Positive_Money_Flow_Sum <= 8.60836e+07 )
						if( Typical_Price <= 35.4765 )
							if( Positive_Money_Flow_Sum <= 5.4089e+07 )
								if( MFI_High <= -24.482 )
									ret := 0.317308
								if( MFI_High > -24.482 )
									ret := -0.354839
							if( Positive_Money_Flow_Sum > 5.4089e+07 )
								if( bearPower <= -0.237769 )
									ret := 0.976190 // buy
								if( bearPower > -0.237769 )
									ret := 0.708333 // buy
						if( Typical_Price > 35.4765 )
							if( Raw_Money_Flow <= 7.61674e+06 )
								if( Raw_Money_Flow <= 5.30406e+06 )
									ret := -0.312500
								if( Raw_Money_Flow > 5.30406e+06 )
									ret := -0.954545 // sell
							if( Raw_Money_Flow > 7.61674e+06 )
								ret := 0.300000
					if( Positive_Money_Flow_Sum > 8.60836e+07 )
						if( Raw_Money_Flow <= 1.21122e+07 )
							if( Raw_Money_Flow <= 7.43771e+06 )
								ret := -0.200000
							if( Raw_Money_Flow > 7.43771e+06 )
								ret := -0.840000 // sell
						if( Raw_Money_Flow > 1.21122e+07 )
							if( bullPower <= 1.1988 )
								ret := -1.000000 // sell
							if( bullPower > 1.1988 )
								ret := 0.454545
				if( Money_Flow_Ratio > 1.27798 )
					if( Raw_Money_Flow <= 4.5948e+06 )
						if( MFI_Low <= 38.1784 )
							if( bearPower <= 0.109773 )
								if( MFI <= 57.9347 )
									ret := -0.049180
								if( MFI > 57.9347 )
									ret := -0.833333 // sell
							if( bearPower > 0.109773 )
								ret := 0.500000
						if( MFI_Low > 38.1784 )
							if( Negative_Money_Flow_Sum <= 3.88799e+07 )
								if( Positive_Money_Flow_Sum <= 5.99216e+07 )
									ret := -0.739130 // sell
								if( Positive_Money_Flow_Sum > 5.99216e+07 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 3.88799e+07 )
								if( Negative_Money_Flow <= 1.22886e+06 )
									ret := 0.831461 // buy
								if( Negative_Money_Flow > 1.22886e+06 )
									ret := 0.300000
					if( Raw_Money_Flow > 4.5948e+06 )
						if( bbp <= 0.417284 )
							if( MFI <= 71.352 )
								if( Raw_Money_Flow <= 7.42671e+06 )
									ret := -0.215311
								if( Raw_Money_Flow > 7.42671e+06 )
									ret := 0.279661
							if( MFI > 71.352 )
								ret := 0.842105 // buy
						if( bbp > 0.417284 )
							if( Typical_Price <= 34.3027 )
								if( bearPower <= -0.049213 )
									ret := 0.562500
								if( bearPower > -0.049213 )
									ret := -0.202726
							if( Typical_Price > 34.3027 )
								if( bbm <= 0.928741 )
									ret := -0.589286
								if( bbm > 0.928741 )
									ret := -0.201031
	
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
float op_operation = decision_tree_0_LINKUSDT_30Min_d833aff8(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


