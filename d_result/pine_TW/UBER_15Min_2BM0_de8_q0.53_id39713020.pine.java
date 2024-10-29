//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: UBER_15Min_2BM0_39713020 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_2BM0_39713020", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_39713020(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.062553 )
		if( Negative_Money_Flow_Sum <= 2.22655e+07 )
			if( Raw_Money_Flow <= 972190 )
				if( MFI <= 13.8996 )
					if( Negative_Money_Flow_Sum <= 3.47032e+06 )
						if( bullPower <= -0.141331 )
							if( Money_Flow_Ratio <= 0.091194 )
								if( Typical_Price <= 37.6178 )
									ret := -0.770833 // sell
								if( Typical_Price > 37.6178 )
									ret := -0.058824
							if( Money_Flow_Ratio > 0.091194 )
								if( Positive_Money_Flow_Sum <= 346845 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 346845 )
									ret := -0.607143
						if( bullPower > -0.141331 )
							if( Positive_Money_Flow_Sum <= 95422.8 )
								if( Positive_Money_Flow_Sum <= 64452.1 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 64452.1 )
									ret := 0.800000 // buy
							if( Positive_Money_Flow_Sum > 95422.8 )
								if( Money_Flow_Ratio <= 0.104413 )
									ret := -0.466667
								if( Money_Flow_Ratio > 0.104413 )
									ret := 0.230769
					if( Negative_Money_Flow_Sum > 3.47032e+06 )
						if( bbm <= 0.135127 )
							if( Typical_Price <= 53.5819 )
								if( Negative_Money_Flow <= 24011.2 )
									ret := 0.571429
								if( Negative_Money_Flow > 24011.2 )
									ret := 0.935484 // buy
							if( Typical_Price > 53.5819 )
								if( Negative_Money_Flow_Sum <= 1.17538e+07 )
									ret := 0.150000
								if( Negative_Money_Flow_Sum > 1.17538e+07 )
									ret := -0.333333
						if( bbm > 0.135127 )
							if( Negative_Money_Flow_Sum <= 6.9159e+06 )
								if( MFI_High <= -73.7821 )
									ret := -0.700000 // sell
								if( MFI_High > -73.7821 )
									ret := 0.769231 // buy
							if( Negative_Money_Flow_Sum > 6.9159e+06 )
								if( Raw_Money_Flow <= 174062 )
									ret := 0.000000
								if( Raw_Money_Flow > 174062 )
									ret := -0.772727 // sell
				if( MFI > 13.8996 )
					if( Raw_Money_Flow <= 54509.4 )
						if( bullPower <= -0.122805 )
							if( bbm <= 0.219444 )
								if( Positive_Money_Flow_Sum <= 217217 )
									ret := 0.585227
								if( Positive_Money_Flow_Sum > 217217 )
									ret := 0.361194
							if( bbm > 0.219444 )
								if( Typical_Price <= 34.4214 )
									ret := -0.866667 // sell
								if( Typical_Price > 34.4214 )
									ret := 0.600000
						if( bullPower > -0.122805 )
							if( Positive_Money_Flow_Sum <= 431551 )
								if( Money_Flow_Ratio <= 0.2668 )
									ret := 0.575758
								if( Money_Flow_Ratio > 0.2668 )
									ret := 0.008130
							if( Positive_Money_Flow_Sum > 431551 )
								if( MFI <= 27.9538 )
									ret := 0.772727 // buy
								if( MFI > 27.9538 )
									ret := 0.251269
					if( Raw_Money_Flow > 54509.4 )
						if( Positive_Money_Flow_Sum <= 2.95783e+08 )
							if( Negative_Money_Flow_Sum <= 235383 )
								if( Typical_Price <= 34.4767 )
									ret := -0.617647
								if( Typical_Price > 34.4767 )
									ret := 0.571429
							if( Negative_Money_Flow_Sum > 235383 )
								if( bullPower <= -0.168092 )
									ret := 0.033435
								if( bullPower > -0.168092 )
									ret := 0.206618
						if( Positive_Money_Flow_Sum > 2.95783e+08 )
							if( bbm <= 0.043312 )
								ret := -0.500000
							if( bbm > 0.043312 )
								ret := -1.000000 // sell
			if( Raw_Money_Flow > 972190 )
				if( Positive_Money_Flow_Sum <= 994341 )
					if( Typical_Price <= 43.6747 )
						if( bullPower <= -0.777948 )
							ret := 1.000000 // buy
						if( bullPower > -0.777948 )
							if( bearPower <= -0.564041 )
								if( Negative_Money_Flow <= 1.37115e+06 )
									ret := -0.200000
								if( Negative_Money_Flow > 1.37115e+06 )
									ret := -0.846154 // sell
							if( bearPower > -0.564041 )
								if( bbm <= 0.225644 )
									ret := -0.550000
								if( bbm > 0.225644 )
									ret := 0.640000
					if( Typical_Price > 43.6747 )
						if( bbp <= -1.01957 )
							if( Positive_Money_Flow_Sum <= 301607 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 301607 )
								ret := 0.666667
						if( bbp > -1.01957 )
							if( bbm <= 0.295 )
								ret := 0.666667
							if( bbm > 0.295 )
								ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 994341 )
					if( Raw_Money_Flow <= 6.8536e+06 )
						if( bbm <= 1.07094 )
							if( bullPower <= -0.144326 )
								if( Negative_Money_Flow_Sum <= 2.07696e+06 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 2.07696e+06 )
									ret := 0.774059 // buy
							if( bullPower > -0.144326 )
								if( Positive_Money_Flow <= 2.28616e+06 )
									ret := 0.448980
								if( Positive_Money_Flow > 2.28616e+06 )
									ret := -0.800000 // sell
						if( bbm > 1.07094 )
							ret := -1.000000 // sell
					if( Raw_Money_Flow > 6.8536e+06 )
						if( bearPower <= -0.436087 )
							if( bullPower <= -0.160043 )
								ret := -1.000000 // sell
							if( bullPower > -0.160043 )
								ret := -0.333333
						if( bearPower > -0.436087 )
							ret := 0.500000
		if( Negative_Money_Flow_Sum > 2.22655e+07 )
			if( bbm <= 0.522514 )
				if( Raw_Money_Flow <= 246155 )
					if( Money_Flow_Ratio <= 0.037592 )
						if( bearPower <= -0.370492 )
							if( Negative_Money_Flow <= 17557.8 )
								if( bullPower <= -0.287135 )
									ret := 0.555556
								if( bullPower > -0.287135 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 17557.8 )
								ret := 1.000000 // buy
						if( bearPower > -0.370492 )
							if( Positive_Money_Flow_Sum <= 641778 )
								if( Negative_Money_Flow_Sum <= 3.38738e+08 )
									ret := -0.011236
								if( Negative_Money_Flow_Sum > 3.38738e+08 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 641778 )
								if( Negative_Money_Flow <= 3980.93 )
									ret := 0.162791
								if( Negative_Money_Flow > 3980.93 )
									ret := 0.528169
					if( Money_Flow_Ratio > 0.037592 )
						if( bearPower <= -0.322392 )
							if( Positive_Money_Flow_Sum <= 3.19266e+06 )
								if( bullPower <= -0.695453 )
									ret := -1.000000 // sell
								if( bullPower > -0.695453 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow_Sum > 3.19266e+06 )
								if( Negative_Money_Flow_Sum <= 1.4622e+08 )
									ret := 0.101449
								if( Negative_Money_Flow_Sum > 1.4622e+08 )
									ret := 0.444444
						if( bearPower > -0.322392 )
							if( Negative_Money_Flow_Sum <= 1.38178e+08 )
								if( Negative_Money_Flow <= 38886.9 )
									ret := 0.232432
								if( Negative_Money_Flow > 38886.9 )
									ret := -0.032258
							if( Negative_Money_Flow_Sum > 1.38178e+08 )
								if( bullPower <= -0.149787 )
									ret := 0.114035
								if( bullPower > -0.149787 )
									ret := -0.036641
				if( Raw_Money_Flow > 246155 )
					if( Positive_Money_Flow_Sum <= 522519 )
						if( Negative_Money_Flow_Sum <= 2.73007e+08 )
							if( Positive_Money_Flow_Sum <= 118319 )
								if( Negative_Money_Flow_Sum <= 6.30055e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 6.30055e+07 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 118319 )
								if( bbm <= 0.505714 )
									ret := -0.481752
								if( bbm > 0.505714 )
									ret := 0.600000
						if( Negative_Money_Flow_Sum > 2.73007e+08 )
							if( bearPower <= -0.445278 )
								if( Raw_Money_Flow <= 4.89904e+07 )
									ret := -0.181818
								if( Raw_Money_Flow > 4.89904e+07 )
									ret := 0.600000
							if( bearPower > -0.445278 )
								ret := 0.714286 // buy
					if( Positive_Money_Flow_Sum > 522519 )
						if( Typical_Price <= 31.8675 )
							if( bbp <= -1.04265 )
								if( MFI_Low <= 13.3562 )
									ret := 0.328502
								if( MFI_Low > 13.3562 )
									ret := 0.923077 // buy
							if( bbp > -1.04265 )
								if( Positive_Money_Flow_Sum <= 1.86876e+08 )
									ret := 0.048468
								if( Positive_Money_Flow_Sum > 1.86876e+08 )
									ret := 0.296443
						if( Typical_Price > 31.8675 )
							if( Negative_Money_Flow_Sum <= 7.41781e+07 )
								if( Raw_Money_Flow <= 1.20295e+07 )
									ret := -0.065217
								if( Raw_Money_Flow > 1.20295e+07 )
									ret := -0.452555
							if( Negative_Money_Flow_Sum > 7.41781e+07 )
								if( Positive_Money_Flow_Sum <= 8.66607e+07 )
									ret := 0.081686
								if( Positive_Money_Flow_Sum > 8.66607e+07 )
									ret := 0.000000
			if( bbm > 0.522514 )
				if( Positive_Money_Flow_Sum <= 9.35664e+08 )
					if( Typical_Price <= 35.0388 )
						if( bullPower <= -0.65453 )
							if( Negative_Money_Flow_Sum <= 1.38777e+08 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 1.38777e+08 )
								if( Typical_Price <= 33.4923 )
									ret := 1.000000 // buy
								if( Typical_Price > 33.4923 )
									ret := 0.777778 // buy
						if( bullPower > -0.65453 )
							if( bearPower <= -1.77552 )
								ret := -1.000000 // sell
							if( bearPower > -1.77552 )
								if( Negative_Money_Flow <= 4.34525e+07 )
									ret := 0.647482
								if( Negative_Money_Flow > 4.34525e+07 )
									ret := 0.330769
					if( Typical_Price > 35.0388 )
						if( bbm <= 0.681123 )
							if( bullPower <= -0.069255 )
								if( Positive_Money_Flow_Sum <= 1.44924e+06 )
									ret := 0.403846
								if( Positive_Money_Flow_Sum > 1.44924e+06 )
									ret := -0.086420
							if( bullPower > -0.069255 )
								ret := 1.000000 // buy
						if( bbm > 0.681123 )
							if( MFI_High <= -40.2239 )
								if( Raw_Money_Flow <= 8.04754e+07 )
									ret := -0.094340
								if( Raw_Money_Flow > 8.04754e+07 )
									ret := 0.430380
							if( MFI_High > -40.2239 )
								if( Positive_Money_Flow_Sum <= 3.75514e+08 )
									ret := 0.830508 // buy
								if( Positive_Money_Flow_Sum > 3.75514e+08 )
									ret := 0.303030
				if( Positive_Money_Flow_Sum > 9.35664e+08 )
					if( Typical_Price <= 40.601 )
						ret := -1.000000 // sell
					if( Typical_Price > 40.601 )
						if( Negative_Money_Flow <= 1.09735e+08 )
							ret := 0.250000
						if( Negative_Money_Flow > 1.09735e+08 )
							ret := -0.600000
	if( bullPower > -0.062553 )
		if( Negative_Money_Flow_Sum <= 379678 )
			if( Positive_Money_Flow <= 2781.37 )
				if( bearPower <= -0.096843 )
					if( bbm <= 0.132139 )
						if( MFI_Low <= 53.2446 )
							if( bbm <= 0.087823 )
								if( Raw_Money_Flow <= 35191.9 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 35191.9 )
									ret := 0.400000
							if( bbm > 0.087823 )
								if( bearPower <= -0.150765 )
									ret := 0.222222
								if( bearPower > -0.150765 )
									ret := -0.375000
						if( MFI_Low > 53.2446 )
							if( bearPower <= -0.112588 )
								ret := 0.714286 // buy
							if( bearPower > -0.112588 )
								ret := 0.200000
					if( bbm > 0.132139 )
						if( Negative_Money_Flow_Sum <= 228887 )
							if( MFI_High <= -6.32484 )
								ret := 0.750000 // buy
							if( MFI_High > -6.32484 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 228887 )
							if( MFI <= 70.3658 )
								if( Typical_Price <= 26.7383 )
									ret := 0.900000 // buy
								if( Typical_Price > 26.7383 )
									ret := 0.382353
							if( MFI > 70.3658 )
								if( MFI_High <= -7.97035 )
									ret := -0.666667
								if( MFI_High > -7.97035 )
									ret := 0.230769
				if( bearPower > -0.096843 )
					if( Money_Flow_Ratio <= 0.579288 )
						if( Positive_Money_Flow_Sum <= 132165 )
							if( Positive_Money_Flow_Sum <= 88865.2 )
								if( bbp <= -0.046811 )
									ret := -0.250000
								if( bbp > -0.046811 )
									ret := -0.800000 // sell
							if( Positive_Money_Flow_Sum > 88865.2 )
								if( MFI <= 33.1234 )
									ret := 0.000000
								if( MFI > 33.1234 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 132165 )
							if( Positive_Money_Flow_Sum <= 163926 )
								if( bbm <= 0.000232 )
									ret := -0.285714
								if( bbm > 0.000232 )
									ret := -0.809524 // sell
							if( Positive_Money_Flow_Sum > 163926 )
								if( Typical_Price <= 34.18 )
									ret := 0.125000
								if( Typical_Price > 34.18 )
									ret := -0.600000
					if( Money_Flow_Ratio > 0.579288 )
						if( Negative_Money_Flow <= 52394.8 )
							if( bullPower <= 0.013092 )
								if( bullPower <= 0.009774 )
									ret := 0.171875
								if( bullPower > 0.009774 )
									ret := 0.750000 // buy
							if( bullPower > 0.013092 )
								if( Positive_Money_Flow <= 231.384 )
									ret := 0.062290
								if( Positive_Money_Flow > 231.384 )
									ret := -0.272727
						if( Negative_Money_Flow > 52394.8 )
							if( bbp <= 0.684796 )
								if( MFI <= 71.369 )
									ret := 0.054945
								if( MFI > 71.369 )
									ret := -0.193878
							if( bbp > 0.684796 )
								if( MFI <= 72.3454 )
									ret := -1.000000 // sell
								if( MFI > 72.3454 )
									ret := -0.750000 // sell
			if( Positive_Money_Flow > 2781.37 )
				if( bullPower <= 0.061901 )
					if( bearPower <= -0.261957 )
						if( Typical_Price <= 31.7486 )
							ret := -1.000000 // sell
						if( Typical_Price > 31.7486 )
							ret := -0.428571
					if( bearPower > -0.261957 )
						if( Positive_Money_Flow_Sum <= 365690 )
							if( Raw_Money_Flow <= 44310.9 )
								if( MFI_Low <= 48.9936 )
									ret := 0.028777
								if( MFI_Low > 48.9936 )
									ret := -0.466667
							if( Raw_Money_Flow > 44310.9 )
								if( Typical_Price <= 34.28 )
									ret := -0.674419
								if( Typical_Price > 34.28 )
									ret := -0.240000
						if( Positive_Money_Flow_Sum > 365690 )
							if( Positive_Money_Flow_Sum <= 1.46933e+06 )
								if( Positive_Money_Flow <= 743738 )
									ret := 0.194175
								if( Positive_Money_Flow > 743738 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.46933e+06 )
								if( Positive_Money_Flow_Sum <= 3.22487e+06 )
									ret := -0.592593
								if( Positive_Money_Flow_Sum > 3.22487e+06 )
									ret := 0.011364
				if( bullPower > 0.061901 )
					if( Positive_Money_Flow_Sum <= 2.33533e+06 )
						if( bullPower <= 0.25568 )
							if( MFI_High <= 12.2707 )
								if( Positive_Money_Flow_Sum <= 194018 )
									ret := -0.459459
								if( Positive_Money_Flow_Sum > 194018 )
									ret := -0.200454
							if( MFI_High > 12.2707 )
								if( Negative_Money_Flow_Sum <= 44334.6 )
									ret := -0.142857
								if( Negative_Money_Flow_Sum > 44334.6 )
									ret := -0.600000
						if( bullPower > 0.25568 )
							if( Typical_Price <= 55.2841 )
								if( Negative_Money_Flow_Sum <= 142924 )
									ret := -0.276923
								if( Negative_Money_Flow_Sum > 142924 )
									ret := -0.645833
							if( Typical_Price > 55.2841 )
								if( Negative_Money_Flow_Sum <= 269136 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 269136 )
									ret := -0.425532
					if( Positive_Money_Flow_Sum > 2.33533e+06 )
						if( Money_Flow_Ratio <= 171.699 )
							if( Positive_Money_Flow <= 1.00905e+06 )
								if( bbm <= 0.140773 )
									ret := 0.131868
								if( bbm > 0.140773 )
									ret := -0.571429
							if( Positive_Money_Flow > 1.00905e+06 )
								if( bearPower <= -0.061889 )
									ret := -0.113636
								if( bearPower > -0.061889 )
									ret := 0.641026
						if( Money_Flow_Ratio > 171.699 )
							if( Positive_Money_Flow_Sum <= 5.46807e+07 )
								if( Money_Flow_Ratio <= 213.154 )
									ret := -0.250000
								if( Money_Flow_Ratio > 213.154 )
									ret := -0.842105 // sell
							if( Positive_Money_Flow_Sum > 5.46807e+07 )
								if( Positive_Money_Flow_Sum <= 8.6544e+07 )
									ret := 0.259259
								if( Positive_Money_Flow_Sum > 8.6544e+07 )
									ret := -0.230000
		if( Negative_Money_Flow_Sum > 379678 )
			if( bearPower <= 0.157459 )
				if( Negative_Money_Flow <= 15.3055 )
					if( Money_Flow_Ratio <= 0.702653 )
						if( MFI <= 13.5949 )
							if( Negative_Money_Flow_Sum <= 7.95569e+06 )
								if( Negative_Money_Flow_Sum <= 5.30941e+06 )
									ret := 0.205128
								if( Negative_Money_Flow_Sum > 5.30941e+06 )
									ret := 0.695652
							if( Negative_Money_Flow_Sum > 7.95569e+06 )
								if( bullPower <= 0.114667 )
									ret := 0.090058
								if( bullPower > 0.114667 )
									ret := -0.211765
						if( MFI > 13.5949 )
							if( bbp <= 0.279873 )
								if( Money_Flow_Ratio <= 0.42823 )
									ret := -0.067597
								if( Money_Flow_Ratio > 0.42823 )
									ret := 0.001122
							if( bbp > 0.279873 )
								if( MFI_Low <= 19.3788 )
									ret := -0.080110
								if( MFI_Low > 19.3788 )
									ret := -0.564103
					if( Money_Flow_Ratio > 0.702653 )
						if( Raw_Money_Flow <= 7.19676e+07 )
							if( bbm <= 0.747902 )
								if( Raw_Money_Flow <= 6.04679e+06 )
									ret := -0.000244
								if( Raw_Money_Flow > 6.04679e+06 )
									ret := 0.057803
							if( bbm > 0.747902 )
								if( bearPower <= -0.164796 )
									ret := -0.338936
								if( bearPower > -0.164796 )
									ret := 0.166667
						if( Raw_Money_Flow > 7.19676e+07 )
							if( MFI <= 52.6092 )
								if( Negative_Money_Flow_Sum <= 1.10776e+09 )
									ret := 0.439815
								if( Negative_Money_Flow_Sum > 1.10776e+09 )
									ret := -0.833333 // sell
							if( MFI > 52.6092 )
								if( bbp <= -0.506979 )
									ret := -0.461538
								if( bbp > -0.506979 )
									ret := 0.136568
				if( Negative_Money_Flow > 15.3055 )
					if( Negative_Money_Flow <= 7.4984e+06 )
						if( bbm <= 0.220039 )
							if( Positive_Money_Flow_Sum <= 7.15451e+07 )
								if( Negative_Money_Flow_Sum <= 699828 )
									ret := 0.026858
								if( Negative_Money_Flow_Sum > 699828 )
									ret := 0.151676
							if( Positive_Money_Flow_Sum > 7.15451e+07 )
								if( Negative_Money_Flow_Sum <= 5.4079e+07 )
									ret := 0.163024
								if( Negative_Money_Flow_Sum > 5.4079e+07 )
									ret := 0.018319
						if( bbm > 0.220039 )
							if( Positive_Money_Flow_Sum <= 3.07315e+06 )
								if( Positive_Money_Flow_Sum <= 2.30867e+06 )
									ret := 0.158228
								if( Positive_Money_Flow_Sum > 2.30867e+06 )
									ret := -0.146919
							if( Positive_Money_Flow_Sum > 3.07315e+06 )
								if( Negative_Money_Flow_Sum <= 2.38033e+08 )
									ret := 0.347826
								if( Negative_Money_Flow_Sum > 2.38033e+08 )
									ret := -0.051282
					if( Negative_Money_Flow > 7.4984e+06 )
						if( bullPower <= 0.242958 )
							if( MFI <= 37.543 )
								if( Raw_Money_Flow <= 4.30629e+07 )
									ret := -0.121374
								if( Raw_Money_Flow > 4.30629e+07 )
									ret := 0.123772
							if( MFI > 37.543 )
								if( Positive_Money_Flow_Sum <= 3.13429e+08 )
									ret := 0.049992
								if( Positive_Money_Flow_Sum > 3.13429e+08 )
									ret := -0.077586
						if( bullPower > 0.242958 )
							if( MFI <= 1.61222 )
								if( bbp <= -0.562316 )
									ret := 0.111111
								if( bbp > -0.562316 )
									ret := -0.547619
							if( MFI > 1.61222 )
								if( bbm <= 2.78967 )
									ret := 0.130016
								if( bbm > 2.78967 )
									ret := 0.909091 // buy
			if( bearPower > 0.157459 )
				if( Raw_Money_Flow <= 1.01863e+06 )
					if( bullPower <= 0.507176 )
						if( Positive_Money_Flow_Sum <= 297658 )
							if( BBPower_Color <= 0.5 )
								ret := -1.000000 // sell
							if( BBPower_Color > 0.5 )
								if( bullPower <= 0.298854 )
									ret := -0.172414
								if( bullPower > 0.298854 )
									ret := -0.555556
						if( Positive_Money_Flow_Sum > 297658 )
							if( bearPower <= 0.336662 )
								if( Typical_Price <= 23.6517 )
									ret := 0.270270
								if( Typical_Price > 23.6517 )
									ret := -0.063023
							if( bearPower > 0.336662 )
								if( MFI_Low <= 3.23398 )
									ret := -0.695652
								if( MFI_Low > 3.23398 )
									ret := -0.188679
					if( bullPower > 0.507176 )
						if( Negative_Money_Flow_Sum <= 6.50284e+06 )
							if( MFI_Low <= 45.9192 )
								if( bbm <= 0.11053 )
									ret := 0.250000
								if( bbm > 0.11053 )
									ret := -0.319444
							if( MFI_Low > 45.9192 )
								if( Negative_Money_Flow <= 843723 )
									ret := -0.691176
								if( Negative_Money_Flow > 843723 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 6.50284e+06 )
							if( Negative_Money_Flow_Sum <= 1.87115e+08 )
								if( bbm <= 0.411375 )
									ret := -0.101010
								if( bbm > 0.411375 )
									ret := 0.466667
							if( Negative_Money_Flow_Sum > 1.87115e+08 )
								if( Typical_Price <= 36.0883 )
									ret := -1.000000 // sell
								if( Typical_Price > 36.0883 )
									ret := -0.513514
				if( Raw_Money_Flow > 1.01863e+06 )
					if( Positive_Money_Flow_Sum <= 2.01693e+08 )
						if( Money_Flow_Ratio <= 7.07583 )
							if( MFI_Low <= 10.3721 )
								if( MFI_High <= -58.944 )
									ret := -0.666667
								if( MFI_High > -58.944 )
									ret := -1.000000 // sell
							if( MFI_Low > 10.3721 )
								if( Raw_Money_Flow <= 8.17997e+06 )
									ret := 0.206395
								if( Raw_Money_Flow > 8.17997e+06 )
									ret := -0.008380
						if( Money_Flow_Ratio > 7.07583 )
							if( bbp <= 1.17468 )
								if( bbm <= 0.490679 )
									ret := 0.268617
								if( bbm > 0.490679 )
									ret := -0.490909
							if( bbp > 1.17468 )
								if( Typical_Price <= 35.7683 )
									ret := 0.206897
								if( Typical_Price > 35.7683 )
									ret := 0.660131
					if( Positive_Money_Flow_Sum > 2.01693e+08 )
						if( Money_Flow_Ratio <= 8.01356 )
							if( MFI_Low <= 30.1798 )
								if( Positive_Money_Flow_Sum <= 2.65183e+08 )
									ret := -0.104167
								if( Positive_Money_Flow_Sum > 2.65183e+08 )
									ret := 0.523438
							if( MFI_Low > 30.1798 )
								if( Negative_Money_Flow_Sum <= 3.03793e+08 )
									ret := 0.014701
								if( Negative_Money_Flow_Sum > 3.03793e+08 )
									ret := -0.232687
						if( Money_Flow_Ratio > 8.01356 )
							if( Money_Flow_Ratio <= 360.628 )
								if( bullPower <= 1.45733 )
									ret := -0.217460
								if( bullPower > 1.45733 )
									ret := 0.162162
							if( Money_Flow_Ratio > 360.628 )
								if( Positive_Money_Flow <= 1.20862e+08 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow > 1.20862e+08 )
									ret := 0.125000
	
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
float op_operation = decision_tree_0_UBER_15Min_39713020(bbp, bullPower, BBPower_Color, bearPower, bbm, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


