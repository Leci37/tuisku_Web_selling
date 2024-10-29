//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: LYFT_15Min_2BM0_a6029411 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_15Min_2BM0_a6029411", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_15Min_a6029411(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow <= 325.097 )
		if( Raw_Money_Flow <= 1.46475e+06 )
			if( bearPower <= -0.014759 )
				if( MFI <= 11.3988 )
					if( bullPower <= -0.203053 )
						if( Negative_Money_Flow_Sum <= 9.724e+07 )
							if( Raw_Money_Flow <= 12744.9 )
								if( Negative_Money_Flow_Sum <= 9.14811e+07 )
									ret := -0.117647
								if( Negative_Money_Flow_Sum > 9.14811e+07 )
									ret := 0.500000
							if( Raw_Money_Flow > 12744.9 )
								if( Positive_Money_Flow_Sum <= 1.02224e+06 )
									ret := 0.677419
								if( Positive_Money_Flow_Sum > 1.02224e+06 )
									ret := 0.050000
						if( Negative_Money_Flow_Sum > 9.724e+07 )
							if( bullPower <= -0.572861 )
								if( Positive_Money_Flow_Sum <= 8.67338e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 8.67338e+06 )
									ret := -0.500000
							if( bullPower > -0.572861 )
								if( Raw_Money_Flow <= 241699 )
									ret := 0.031250
								if( Raw_Money_Flow > 241699 )
									ret := -0.500000
					if( bullPower > -0.203053 )
						if( Negative_Money_Flow_Sum <= 1.03942e+07 )
							if( Positive_Money_Flow_Sum <= 35701 )
								if( bearPower <= -0.069658 )
									ret := 0.695652
								if( bearPower > -0.069658 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 35701 )
								if( MFI_Low <= -12.3639 )
									ret := -0.549550
								if( MFI_Low > -12.3639 )
									ret := -0.216495
						if( Negative_Money_Flow_Sum > 1.03942e+07 )
							if( bbm <= 0.079778 )
								if( Negative_Money_Flow_Sum <= 4.25838e+07 )
									ret := 0.339506
								if( Negative_Money_Flow_Sum > 4.25838e+07 )
									ret := 0.044843
							if( bbm > 0.079778 )
								if( bbp <= -0.113947 )
									ret := -0.302083
								if( bbp > -0.113947 )
									ret := 0.148936
				if( MFI > 11.3988 )
					if( bullPower <= -0.64483 )
						if( Positive_Money_Flow_Sum <= 1.0239e+07 )
							if( Negative_Money_Flow <= 10513 )
								if( bbp <= -1.93966 )
									ret := -0.250000
								if( bbp > -1.93966 )
									ret := -0.875000 // sell
							if( Negative_Money_Flow > 10513 )
								if( Typical_Price <= 27.7117 )
									ret := -0.875000 // sell
								if( Typical_Price > 27.7117 )
									ret := 0.622222
						if( Positive_Money_Flow_Sum > 1.0239e+07 )
							if( Positive_Money_Flow_Sum <= 1.60818e+08 )
								if( bbm <= 0.067287 )
									ret := 0.796610 // buy
								if( bbm > 0.067287 )
									ret := 0.400000
							if( Positive_Money_Flow_Sum > 1.60818e+08 )
								ret := 0.000000
					if( bullPower > -0.64483 )
						if( Negative_Money_Flow <= 37896.4 )
							if( Negative_Money_Flow <= 241.044 )
								if( Positive_Money_Flow_Sum <= 2.47897e+08 )
									ret := 0.060172
								if( Positive_Money_Flow_Sum > 2.47897e+08 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 241.044 )
								if( bbm <= 0.020813 )
									ret := 0.182419
								if( bbm > 0.020813 )
									ret := 0.302923
						if( Negative_Money_Flow > 37896.4 )
							if( Negative_Money_Flow_Sum <= 1.05711e+06 )
								if( Typical_Price <= 17.0545 )
									ret := 0.196921
								if( Typical_Price > 17.0545 )
									ret := -0.009863
							if( Negative_Money_Flow_Sum > 1.05711e+06 )
								if( MFI <= 13.2838 )
									ret := 0.513514
								if( MFI > 13.2838 )
									ret := 0.171062
			if( bearPower > -0.014759 )
				if( bbm <= 0.010029 )
					if( Money_Flow_Ratio <= 1599.13 )
						if( MFI_Low <= 78.7629 )
							if( Positive_Money_Flow <= 191.004 )
								if( Positive_Money_Flow <= 68.6689 )
									ret := 0.006308
								if( Positive_Money_Flow > 68.6689 )
									ret := -0.714286 // sell
							if( Positive_Money_Flow > 191.004 )
								ret := 1.000000 // buy
						if( MFI_Low > 78.7629 )
							if( Raw_Money_Flow <= 39036 )
								if( Negative_Money_Flow <= 7997.7 )
									ret := 0.200000
								if( Negative_Money_Flow > 7997.7 )
									ret := -0.085714
							if( Raw_Money_Flow > 39036 )
								if( Positive_Money_Flow_Sum <= 1.19803e+08 )
									ret := 0.791667 // buy
								if( Positive_Money_Flow_Sum > 1.19803e+08 )
									ret := 0.000000
					if( Money_Flow_Ratio > 1599.13 )
						ret := -0.800000 // sell
				if( bbm > 0.010029 )
					if( bbm <= 0.099649 )
						if( MFI <= 45.7359 )
							if( Negative_Money_Flow_Sum <= 1.46946e+07 )
								if( Typical_Price <= 11.3883 )
									ret := 0.115385
								if( Typical_Price > 11.3883 )
									ret := 0.436000
							if( Negative_Money_Flow_Sum > 1.46946e+07 )
								if( Negative_Money_Flow <= 15107.2 )
									ret := 0.253968
								if( Negative_Money_Flow > 15107.2 )
									ret := 0.000000
						if( MFI > 45.7359 )
							if( MFI_High <= -27.6021 )
								if( Negative_Money_Flow_Sum <= 9.73612e+06 )
									ret := -0.397590
								if( Negative_Money_Flow_Sum > 9.73612e+06 )
									ret := 0.146341
							if( MFI_High > -27.6021 )
								if( Typical_Price <= 22.4822 )
									ret := 0.077821
								if( Typical_Price > 22.4822 )
									ret := 0.254279
					if( bbm > 0.099649 )
						if( Typical_Price <= 57.2816 )
							if( Positive_Money_Flow_Sum <= 4.99709e+07 )
								if( MFI_High <= -38.7799 )
									ret := 0.187879
								if( MFI_High > -38.7799 )
									ret := -0.100000
							if( Positive_Money_Flow_Sum > 4.99709e+07 )
								if( Raw_Money_Flow <= 29345.6 )
									ret := 0.866667 // buy
								if( Raw_Money_Flow > 29345.6 )
									ret := 0.149606
						if( Typical_Price > 57.2816 )
							if( Positive_Money_Flow_Sum <= 2.4513e+07 )
								if( Negative_Money_Flow_Sum <= 2.06539e+06 )
									ret := -0.730769 // sell
								if( Negative_Money_Flow_Sum > 2.06539e+06 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 2.4513e+07 )
								if( MFI_Low <= 75.957 )
									ret := -0.066667
								if( MFI_Low > 75.957 )
									ret := 0.750000 // buy
		if( Raw_Money_Flow > 1.46475e+06 )
			if( Positive_Money_Flow_Sum <= 1.8606e+07 )
				if( bullPower <= -0.838488 )
					if( Negative_Money_Flow_Sum <= 8.99751e+07 )
						if( Money_Flow_Ratio <= 0.01264 )
							if( MFI <= 0.61534 )
								if( bbp <= -2.68204 )
									ret := -0.500000
								if( bbp > -2.68204 )
									ret := 0.000000
							if( MFI > 0.61534 )
								if( Negative_Money_Flow_Sum <= 7.12502e+07 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 7.12502e+07 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.01264 )
							if( Negative_Money_Flow_Sum <= 6.10042e+07 )
								if( Money_Flow_Ratio <= 0.169833 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.169833 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 6.10042e+07 )
								if( bbm <= 0.6125 )
									ret := 0.000000
								if( bbm > 0.6125 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 8.99751e+07 )
						if( Raw_Money_Flow <= 3.45081e+07 )
							if( bearPower <= -1.68064 )
								ret := 1.000000 // buy
							if( bearPower > -1.68064 )
								if( bbp <= -2.5636 )
									ret := 0.307692
								if( bbp > -2.5636 )
									ret := 0.800000 // buy
						if( Raw_Money_Flow > 3.45081e+07 )
							if( Positive_Money_Flow_Sum <= 4.988e+06 )
								if( Raw_Money_Flow <= 3.91693e+07 )
									ret := -0.800000 // sell
								if( Raw_Money_Flow > 3.91693e+07 )
									ret := 0.133333
							if( Positive_Money_Flow_Sum > 4.988e+06 )
								ret := 1.000000 // buy
				if( bullPower > -0.838488 )
					if( bbp <= -0.342409 )
						if( Raw_Money_Flow <= 9.59293e+06 )
							if( bbp <= -1.48015 )
								if( Negative_Money_Flow_Sum <= 6.45705e+07 )
									ret := -0.136364
								if( Negative_Money_Flow_Sum > 6.45705e+07 )
									ret := 0.500000
							if( bbp > -1.48015 )
								if( Negative_Money_Flow_Sum <= 1.23204e+08 )
									ret := -0.207097
								if( Negative_Money_Flow_Sum > 1.23204e+08 )
									ret := 0.521739
						if( Raw_Money_Flow > 9.59293e+06 )
							if( Typical_Price <= 56.7109 )
								if( Positive_Money_Flow_Sum <= 1.55534e+07 )
									ret := 0.021245
								if( Positive_Money_Flow_Sum > 1.55534e+07 )
									ret := 0.436090
							if( Typical_Price > 56.7109 )
								if( bearPower <= -0.620467 )
									ret := -0.427419
								if( bearPower > -0.620467 )
									ret := 0.190476
					if( bbp > -0.342409 )
						if( Money_Flow_Ratio <= 2.6811 )
							if( Negative_Money_Flow_Sum <= 5.51708e+06 )
								if( bearPower <= -0.189401 )
									ret := -0.121212
								if( bearPower > -0.189401 )
									ret := 0.632075
							if( Negative_Money_Flow_Sum > 5.51708e+06 )
								if( MFI_Low <= -16.4834 )
									ret := 0.184725
								if( MFI_Low > -16.4834 )
									ret := -0.007199
						if( Money_Flow_Ratio > 2.6811 )
							if( Negative_Money_Flow <= 2.47395e+06 )
								ret := 0.400000
							if( Negative_Money_Flow > 2.47395e+06 )
								if( Typical_Price <= 11.7215 )
									ret := -1.000000 // sell
								if( Typical_Price > 11.7215 )
									ret := -0.695652
			if( Positive_Money_Flow_Sum > 1.8606e+07 )
				if( Positive_Money_Flow_Sum <= 5.98503e+07 )
					if( Negative_Money_Flow_Sum <= 1.431e+08 )
						if( Positive_Money_Flow_Sum <= 5.13018e+07 )
							if( bullPower <= 0.83911 )
								if( Typical_Price <= 39.1558 )
									ret := 0.092890
								if( Typical_Price > 39.1558 )
									ret := 0.009527
							if( bullPower > 0.83911 )
								if( Negative_Money_Flow <= 1.9354e+07 )
									ret := 0.275862
								if( Negative_Money_Flow > 1.9354e+07 )
									ret := 0.821429 // buy
						if( Positive_Money_Flow_Sum > 5.13018e+07 )
							if( bbm <= 0.289109 )
								if( bbp <= -0.891952 )
									ret := -0.714286 // sell
								if( bbp > -0.891952 )
									ret := 0.146505
							if( bbm > 0.289109 )
								if( MFI_Low <= 12.5871 )
									ret := -0.192308
								if( MFI_Low > 12.5871 )
									ret := 0.391089
					if( Negative_Money_Flow_Sum > 1.431e+08 )
						if( bearPower <= -0.931983 )
							if( Raw_Money_Flow <= 1.66895e+08 )
								if( bbm <= 0.25 )
									ret := -0.333333
								if( bbm > 0.25 )
									ret := 0.774834 // buy
							if( Raw_Money_Flow > 1.66895e+08 )
								ret := -0.600000
						if( bearPower > -0.931983 )
							if( Positive_Money_Flow_Sum <= 3.5674e+07 )
								if( Negative_Money_Flow <= 9.95585e+06 )
									ret := -0.608696
								if( Negative_Money_Flow > 9.95585e+06 )
									ret := -0.018519
							if( Positive_Money_Flow_Sum > 3.5674e+07 )
								if( Positive_Money_Flow_Sum <= 4.79924e+07 )
									ret := 0.510204
								if( Positive_Money_Flow_Sum > 4.79924e+07 )
									ret := 0.028986
				if( Positive_Money_Flow_Sum > 5.98503e+07 )
					if( MFI <= 44.3618 )
						if( Typical_Price <= 29.7843 )
							if( Positive_Money_Flow_Sum <= 1.028e+08 )
								if( Negative_Money_Flow_Sum <= 9.4921e+07 )
									ret := 0.035714
								if( Negative_Money_Flow_Sum > 9.4921e+07 )
									ret := -0.647059
							if( Positive_Money_Flow_Sum > 1.028e+08 )
								if( Positive_Money_Flow_Sum <= 3.37228e+08 )
									ret := 0.360000
								if( Positive_Money_Flow_Sum > 3.37228e+08 )
									ret := -1.000000 // sell
						if( Typical_Price > 29.7843 )
							if( bullPower <= -0.852075 )
								if( Positive_Money_Flow_Sum <= 1.29287e+08 )
									ret := 0.933333 // buy
								if( Positive_Money_Flow_Sum > 1.29287e+08 )
									ret := 0.391304
							if( bullPower > -0.852075 )
								if( Negative_Money_Flow_Sum <= 1.4358e+08 )
									ret := -0.291803
								if( Negative_Money_Flow_Sum > 1.4358e+08 )
									ret := -0.022436
					if( MFI > 44.3618 )
						if( Typical_Price <= 17.0999 )
							if( MFI <= 85.2102 )
								if( Positive_Money_Flow_Sum <= 7.50384e+07 )
									ret := -0.313208
								if( Positive_Money_Flow_Sum > 7.50384e+07 )
									ret := -0.104478
							if( MFI > 85.2102 )
								if( bbp <= 0.424535 )
									ret := 0.000000
								if( bbp > 0.424535 )
									ret := 0.619048
						if( Typical_Price > 17.0999 )
							if( Positive_Money_Flow_Sum <= 2.2577e+08 )
								if( bearPower <= -0.609798 )
									ret := 0.502564
								if( bearPower > -0.609798 )
									ret := 0.075435
							if( Positive_Money_Flow_Sum > 2.2577e+08 )
								if( Typical_Price <= 32.525 )
									ret := 0.520000
								if( Typical_Price > 32.525 )
									ret := -0.294737
	if( Positive_Money_Flow > 325.097 )
		if( Negative_Money_Flow <= 21.2192 )
			if( Positive_Money_Flow <= 1.16376e+06 )
				if( bbp <= 0.069299 )
					if( bbp <= -1.29791 )
						if( bbm <= 0.16 )
							if( Money_Flow_Ratio <= 3.76125 )
								if( MFI_High <= -46.758 )
									ret := 0.428571
								if( MFI_High > -46.758 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 3.76125 )
								ret := -0.333333
						if( bbm > 0.16 )
							if( Positive_Money_Flow <= 29470 )
								ret := 0.600000
							if( Positive_Money_Flow > 29470 )
								if( Positive_Money_Flow <= 532068 )
									ret := -0.769231 // sell
								if( Positive_Money_Flow > 532068 )
									ret := 0.250000
					if( bbp > -1.29791 )
						if( bullPower <= 0.091631 )
							if( bbm <= 0.70455 )
								if( bbm <= 0.059985 )
									ret := 0.011301
								if( bbm > 0.059985 )
									ret := -0.047368
							if( bbm > 0.70455 )
								if( Typical_Price <= 40.7354 )
									ret := -1.000000 // sell
								if( Typical_Price > 40.7354 )
									ret := -0.200000
						if( bullPower > 0.091631 )
							if( MFI_High <= -62.0919 )
								if( bbm <= 0.37 )
									ret := -0.473684
								if( bbm > 0.37 )
									ret := -0.866667 // sell
							if( MFI_High > -62.0919 )
								if( bbp <= -0.049423 )
									ret := 0.083333
								if( bbp > -0.049423 )
									ret := -0.264840
				if( bbp > 0.069299 )
					if( Negative_Money_Flow_Sum <= 4.75886e+07 )
						if( Money_Flow_Ratio <= 0.876593 )
							if( bbm <= 0.142518 )
								if( Negative_Money_Flow_Sum <= 136021 )
									ret := 0.571429
								if( Negative_Money_Flow_Sum > 136021 )
									ret := -0.242563
							if( bbm > 0.142518 )
								if( Negative_Money_Flow_Sum <= 4.47727e+07 )
									ret := 0.016667
								if( Negative_Money_Flow_Sum > 4.47727e+07 )
									ret := 0.769231 // buy
						if( Money_Flow_Ratio > 0.876593 )
							if( bbm <= 0.18608 )
								if( Raw_Money_Flow <= 148637 )
									ret := -0.049564
								if( Raw_Money_Flow > 148637 )
									ret := 0.063802
							if( bbm > 0.18608 )
								if( Money_Flow_Ratio <= 1.59667 )
									ret := 0.128079
								if( Money_Flow_Ratio > 1.59667 )
									ret := -0.247312
					if( Negative_Money_Flow_Sum > 4.75886e+07 )
						if( Negative_Money_Flow_Sum <= 8.85816e+07 )
							if( Typical_Price <= 31.4659 )
								if( bullPower <= 0.126769 )
									ret := -0.255556
								if( bullPower > 0.126769 )
									ret := -0.682927
							if( Typical_Price > 31.4659 )
								if( MFI_High <= -28.6068 )
									ret := -0.308176
								if( MFI_High > -28.6068 )
									ret := -0.044444
						if( Negative_Money_Flow_Sum > 8.85816e+07 )
							if( MFI_High <= -69.5846 )
								if( Positive_Money_Flow_Sum <= 2.61514e+06 )
									ret := -0.107143
								if( Positive_Money_Flow_Sum > 2.61514e+06 )
									ret := -0.697674
							if( MFI_High > -69.5846 )
								if( Negative_Money_Flow_Sum <= 1.24816e+08 )
									ret := -0.153846
								if( Negative_Money_Flow_Sum > 1.24816e+08 )
									ret := 0.205479
			if( Positive_Money_Flow > 1.16376e+06 )
				if( Positive_Money_Flow <= 4.39775e+07 )
					if( Money_Flow_Ratio <= 682.052 )
						if( Typical_Price <= 10.1029 )
							if( MFI <= 36.5309 )
								if( bbp <= 0.091174 )
									ret := -0.016854
								if( bbp > 0.091174 )
									ret := -0.875000 // sell
							if( MFI > 36.5309 )
								if( BBPower_Color <= 0.5 )
									ret := 0.400810
								if( BBPower_Color > 0.5 )
									ret := 0.198885
						if( Typical_Price > 10.1029 )
							if( Positive_Money_Flow_Sum <= 2.10239e+07 )
								if( MFI_High <= -42.3024 )
									ret := 0.041284
								if( MFI_High > -42.3024 )
									ret := -0.095049
							if( Positive_Money_Flow_Sum > 2.10239e+07 )
								if( Negative_Money_Flow_Sum <= 1.9675e+07 )
									ret := 0.122376
								if( Negative_Money_Flow_Sum > 1.9675e+07 )
									ret := 0.044898
					if( Money_Flow_Ratio > 682.052 )
						if( Positive_Money_Flow <= 1.48642e+07 )
							if( bearPower <= 0.178913 )
								ret := 0.750000 // buy
							if( bearPower > 0.178913 )
								if( Positive_Money_Flow <= 6.33494e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 6.33494e+06 )
									ret := -0.142857
						if( Positive_Money_Flow > 1.48642e+07 )
							if( bbm <= 0.33395 )
								ret := -0.600000
							if( bbm > 0.33395 )
								if( Negative_Money_Flow_Sum <= 110615 )
									ret := -0.846154 // sell
								if( Negative_Money_Flow_Sum > 110615 )
									ret := -1.000000 // sell
				if( Positive_Money_Flow > 4.39775e+07 )
					if( MFI <= 99.1233 )
						if( MFI_High <= 14.4904 )
							if( Typical_Price <= 48.9594 )
								if( Negative_Money_Flow_Sum <= 1.09388e+08 )
									ret := -0.055172
								if( Negative_Money_Flow_Sum > 1.09388e+08 )
									ret := 0.400000
							if( Typical_Price > 48.9594 )
								if( MFI_High <= -7.43196 )
									ret := -0.525424
								if( MFI_High > -7.43196 )
									ret := 0.000000
						if( MFI_High > 14.4904 )
							if( Typical_Price <= 48.3146 )
								if( bbm <= 0.4298 )
									ret := 0.000000
								if( bbm > 0.4298 )
									ret := -0.842105 // sell
							if( Typical_Price > 48.3146 )
								if( Typical_Price <= 61.3072 )
									ret := 0.315789
								if( Typical_Price > 61.3072 )
									ret := -0.857143 // sell
					if( MFI > 99.1233 )
						if( bbp <= 2.57965 )
							if( Typical_Price <= 45.0138 )
								ret := 1.000000 // buy
							if( Typical_Price > 45.0138 )
								ret := 0.600000
						if( bbp > 2.57965 )
							ret := -0.500000
		if( Negative_Money_Flow > 21.2192 )
			if( bullPower <= 0.060662 )
				if( Negative_Money_Flow <= 1052.1 )
					if( Money_Flow_Ratio <= 0.034751 )
						if( Positive_Money_Flow <= 37774.1 )
							if( MFI <= 1.10967 )
								ret := 0.000000
							if( MFI > 1.10967 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 37774.1 )
							if( Positive_Money_Flow <= 55477.1 )
								ret := -0.500000
							if( Positive_Money_Flow > 55477.1 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.034751 )
						if( Raw_Money_Flow <= 71057.1 )
							if( MFI_High <= 5.7416 )
								if( Negative_Money_Flow_Sum <= 6.65579e+07 )
									ret := 0.810345 // buy
								if( Negative_Money_Flow_Sum > 6.65579e+07 )
									ret := 0.000000
							if( MFI_High > 5.7416 )
								if( Negative_Money_Flow <= 430.19 )
									ret := -0.333333
								if( Negative_Money_Flow > 430.19 )
									ret := 0.750000 // buy
						if( Raw_Money_Flow > 71057.1 )
							if( Positive_Money_Flow <= 85656.6 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 85656.6 )
								if( bbm <= 0.044658 )
									ret := 0.111111
								if( bbm > 0.044658 )
									ret := 0.666667
				if( Negative_Money_Flow > 1052.1 )
					if( Positive_Money_Flow_Sum <= 218809 )
						if( Positive_Money_Flow_Sum <= 139195 )
							if( Typical_Price <= 11.4867 )
								if( Positive_Money_Flow_Sum <= 83910.1 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 83910.1 )
									ret := -1.000000 // sell
							if( Typical_Price > 11.4867 )
								if( bullPower <= -0.233877 )
									ret := 1.000000 // buy
								if( bullPower > -0.233877 )
									ret := 0.242105
						if( Positive_Money_Flow_Sum > 139195 )
							if( MFI <= 55.8639 )
								if( Money_Flow_Ratio <= 0.004122 )
									ret := 0.400000
								if( Money_Flow_Ratio > 0.004122 )
									ret := -0.535354
							if( MFI > 55.8639 )
								if( Typical_Price <= 16.096 )
									ret := 1.000000 // buy
								if( Typical_Price > 16.096 )
									ret := -0.600000
					if( Positive_Money_Flow_Sum > 218809 )
						if( Negative_Money_Flow <= 29603.2 )
							if( Typical_Price <= 45.517 )
								if( bearPower <= 0.006614 )
									ret := 0.302956
								if( bearPower > 0.006614 )
									ret := -0.094891
							if( Typical_Price > 45.517 )
								if( Positive_Money_Flow_Sum <= 5.61098e+07 )
									ret := 0.449438
								if( Positive_Money_Flow_Sum > 5.61098e+07 )
									ret := 0.774648 // buy
						if( Negative_Money_Flow > 29603.2 )
							if( Negative_Money_Flow_Sum <= 3.69001e+07 )
								if( Negative_Money_Flow_Sum <= 259510 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 259510 )
									ret := 0.296000
							if( Negative_Money_Flow_Sum > 3.69001e+07 )
								if( Positive_Money_Flow <= 202160 )
									ret := -0.153285
								if( Positive_Money_Flow > 202160 )
									ret := 0.221719
			if( bullPower > 0.060662 )
				if( Negative_Money_Flow <= 586130 )
					if( Raw_Money_Flow <= 236497 )
						if( Negative_Money_Flow_Sum <= 2.13074e+07 )
							if( bbm <= 0.005337 )
								if( Money_Flow_Ratio <= 0.050372 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.050372 )
									ret := -0.123596
							if( bbm > 0.005337 )
								if( Negative_Money_Flow_Sum <= 261922 )
									ret := -0.171717
								if( Negative_Money_Flow_Sum > 261922 )
									ret := 0.239180
						if( Negative_Money_Flow_Sum > 2.13074e+07 )
							if( BBPower_Color <= 0.5 )
								if( bullPower <= 0.421747 )
									ret := -0.106977
								if( bullPower > 0.421747 )
									ret := 0.750000 // buy
							if( BBPower_Color > 0.5 )
								if( Negative_Money_Flow_Sum <= 2.39861e+07 )
									ret := -0.851852 // sell
								if( Negative_Money_Flow_Sum > 2.39861e+07 )
									ret := -0.341772
					if( Raw_Money_Flow > 236497 )
						if( bbm <= 0.099658 )
							if( MFI <= 81.6867 )
								if( Negative_Money_Flow <= 5921.17 )
									ret := 0.428571
								if( Negative_Money_Flow > 5921.17 )
									ret := -0.434783
							if( MFI > 81.6867 )
								if( Typical_Price <= 19.5511 )
									ret := 0.000000
								if( Typical_Price > 19.5511 )
									ret := 0.750000 // buy
						if( bbm > 0.099658 )
							if( bullPower <= 0.154693 )
								if( Negative_Money_Flow_Sum <= 3.57452e+07 )
									ret := 0.454545
								if( Negative_Money_Flow_Sum > 3.57452e+07 )
									ret := -0.071429
							if( bullPower > 0.154693 )
								if( Positive_Money_Flow_Sum <= 1.97753e+08 )
									ret := 0.600000
								if( Positive_Money_Flow_Sum > 1.97753e+08 )
									ret := -0.076923
				if( Negative_Money_Flow > 586130 )
					if( bbp <= 0.718592 )
						if( bbm <= 0.394956 )
							if( MFI_High <= 3.47273 )
								if( Positive_Money_Flow <= 12175.8 )
									ret := -0.090909
								if( Positive_Money_Flow > 12175.8 )
									ret := -0.701299 // sell
							if( MFI_High > 3.47273 )
								if( Raw_Money_Flow <= 4.27811e+06 )
									ret := -0.600000
								if( Raw_Money_Flow > 4.27811e+06 )
									ret := 1.000000 // buy
						if( bbm > 0.394956 )
							if( MFI_High <= -22.6417 )
								if( bbm <= 0.450487 )
									ret := 1.000000 // buy
								if( bbm > 0.450487 )
									ret := -0.750000 // sell
							if( MFI_High > -22.6417 )
								if( Raw_Money_Flow <= 6.16159e+06 )
									ret := -0.500000
								if( Raw_Money_Flow > 6.16159e+06 )
									ret := 0.750000 // buy
					if( bbp > 0.718592 )
						if( Money_Flow_Ratio <= 1.37945 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 1.37945 )
							if( MFI_Low <= 63.6135 )
								if( Negative_Money_Flow <= 4.13897e+06 )
									ret := 0.142857
								if( Negative_Money_Flow > 4.13897e+06 )
									ret := 0.729730 // buy
							if( MFI_Low > 63.6135 )
								if( Positive_Money_Flow <= 5.33114e+06 )
									ret := 0.666667
								if( Positive_Money_Flow > 5.33114e+06 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_LYFT_15Min_a6029411(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


