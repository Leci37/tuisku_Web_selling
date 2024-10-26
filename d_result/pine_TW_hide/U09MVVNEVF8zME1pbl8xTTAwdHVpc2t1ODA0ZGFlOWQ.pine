//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: SOLUSDT_30Min_1M00_804dae9d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_30Min_1M00_804dae9d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_30Min_804dae9d(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 569401 )
		if( Typical_Price <= 2.52631 )
			if( Typical_Price <= 1.37152 )
				if( MFI_High <= -12.9501 )
					if( Positive_Money_Flow_Sum <= 193691 )
						if( Negative_Money_Flow_Sum <= 313803 )
							if( Negative_Money_Flow_Sum <= 210187 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 210187 )
								if( Negative_Money_Flow_Sum <= 269694 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 269694 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 313803 )
							if( Negative_Money_Flow_Sum <= 389973 )
								if( Typical_Price <= 1.32377 )
									ret := 0.000000
								if( Typical_Price > 1.32377 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 389973 )
								if( Typical_Price <= 1.33625 )
									ret := 0.625000
								if( Typical_Price > 1.33625 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 193691 )
						if( Raw_Money_Flow <= 14600.4 )
							if( Typical_Price <= 1.35227 )
								ret := 0.000000
							if( Typical_Price > 1.35227 )
								ret := -0.800000 // sell
						if( Raw_Money_Flow > 14600.4 )
							if( Negative_Money_Flow_Sum <= 467369 )
								if( Negative_Money_Flow <= 39789.5 )
									ret := 0.491228
								if( Negative_Money_Flow > 39789.5 )
									ret := -0.214286
							if( Negative_Money_Flow_Sum > 467369 )
								if( Negative_Money_Flow <= 63338.9 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 63338.9 )
									ret := 0.600000
				if( MFI_High > -12.9501 )
					if( Typical_Price <= 1.35925 )
						if( MFI_High <= -9.8116 )
							ret := -1.000000 // sell
						if( MFI_High > -9.8116 )
							ret := -0.750000 // sell
					if( Typical_Price > 1.35925 )
						ret := 0.250000
			if( Typical_Price > 1.37152 )
				if( MFI_High <= -61.3813 )
					if( Negative_Money_Flow_Sum <= 447708 )
						if( Typical_Price <= 1.87577 )
							if( MFI_Low <= -6.10455 )
								if( MFI_Low <= -7.7836 )
									ret := 0.714286 // buy
								if( MFI_Low > -7.7836 )
									ret := 0.000000
							if( MFI_Low > -6.10455 )
								if( Negative_Money_Flow_Sum <= 422282 )
									ret := 0.933333 // buy
								if( Negative_Money_Flow_Sum > 422282 )
									ret := 0.666667
						if( Typical_Price > 1.87577 )
							if( Money_Flow_Ratio <= 0.171114 )
								ret := 0.000000
							if( Money_Flow_Ratio > 0.171114 )
								ret := -0.250000
					if( Negative_Money_Flow_Sum > 447708 )
						if( MFI_Low <= -9.26099 )
							ret := 0.833333 // buy
						if( MFI_Low > -9.26099 )
							if( Positive_Money_Flow_Sum <= 115701 )
								if( Negative_Money_Flow_Sum <= 511174 )
									ret := -0.400000
								if( Negative_Money_Flow_Sum > 511174 )
									ret := 0.333333
							if( Positive_Money_Flow_Sum > 115701 )
								ret := 0.666667
				if( MFI_High > -61.3813 )
					if( Positive_Money_Flow_Sum <= 173155 )
						if( Negative_Money_Flow_Sum <= 430354 )
							if( Money_Flow_Ratio <= 0.252702 )
								if( Typical_Price <= 1.88977 )
									ret := 0.900000 // buy
								if( Typical_Price > 1.88977 )
									ret := -0.272727
							if( Money_Flow_Ratio > 0.252702 )
								if( Negative_Money_Flow_Sum <= 296704 )
									ret := -0.126404
								if( Negative_Money_Flow_Sum > 296704 )
									ret := -0.394558
						if( Negative_Money_Flow_Sum > 430354 )
							if( Typical_Price <= 1.57806 )
								if( Negative_Money_Flow_Sum <= 534967 )
									ret := -0.307692
								if( Negative_Money_Flow_Sum > 534967 )
									ret := 0.666667
							if( Typical_Price > 1.57806 )
								if( Negative_Money_Flow <= 49780 )
									ret := -0.920635 // sell
								if( Negative_Money_Flow > 49780 )
									ret := -0.222222
					if( Positive_Money_Flow_Sum > 173155 )
						if( Positive_Money_Flow_Sum <= 231471 )
							if( Positive_Money_Flow_Sum <= 198453 )
								if( MFI_High <= -55.7979 )
									ret := 1.000000 // buy
								if( MFI_High > -55.7979 )
									ret := -0.038168
							if( Positive_Money_Flow_Sum > 198453 )
								if( Positive_Money_Flow <= 86221.9 )
									ret := 0.414747
								if( Positive_Money_Flow > 86221.9 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 231471 )
							if( MFI_High <= -37.6807 )
								if( Positive_Money_Flow_Sum <= 258533 )
									ret := 0.084507
								if( Positive_Money_Flow_Sum > 258533 )
									ret := -0.567251
							if( MFI_High > -37.6807 )
								if( Money_Flow_Ratio <= 14.3455 )
									ret := 0.011923
								if( Money_Flow_Ratio > 14.3455 )
									ret := -0.846154 // sell
		if( Typical_Price > 2.52631 )
			if( MFI <= 52.8346 )
				if( Raw_Money_Flow <= 96751.3 )
					if( Negative_Money_Flow_Sum <= 262252 )
						if( Positive_Money_Flow_Sum <= 113542 )
							ret := -0.833333 // sell
						if( Positive_Money_Flow_Sum > 113542 )
							if( Raw_Money_Flow <= 13709.5 )
								if( Positive_Money_Flow <= 5547.71 )
									ret := 0.200000
								if( Positive_Money_Flow > 5547.71 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 13709.5 )
								if( Raw_Money_Flow <= 31707.5 )
									ret := 0.000000
								if( Raw_Money_Flow > 31707.5 )
									ret := -0.250000
					if( Negative_Money_Flow_Sum > 262252 )
						if( Positive_Money_Flow_Sum <= 433621 )
							if( MFI <= 43.4642 )
								if( MFI <= 39.8626 )
									ret := -0.640625
								if( MFI > 39.8626 )
									ret := -0.916667 // sell
							if( MFI > 43.4642 )
								if( Negative_Money_Flow <= 12767.6 )
									ret := -0.619048
								if( Negative_Money_Flow > 12767.6 )
									ret := 0.055556
						if( Positive_Money_Flow_Sum > 433621 )
							if( Negative_Money_Flow <= 73994.6 )
								if( Raw_Money_Flow <= 47541.9 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 47541.9 )
									ret := -0.833333 // sell
							if( Negative_Money_Flow > 73994.6 )
								ret := -0.500000
				if( Raw_Money_Flow > 96751.3 )
					if( Negative_Money_Flow <= 151601 )
						if( Negative_Money_Flow_Sum <= 367180 )
							if( Raw_Money_Flow <= 114711 )
								ret := 0.750000 // buy
							if( Raw_Money_Flow > 114711 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 367180 )
							ret := 0.142857
					if( Negative_Money_Flow > 151601 )
						ret := -0.833333 // sell
			if( MFI > 52.8346 )
				if( MFI <= 56.3327 )
					if( Negative_Money_Flow_Sum <= 517755 )
						if( Money_Flow_Ratio <= 1.25838 )
							if( Negative_Money_Flow_Sum <= 315992 )
								if( Positive_Money_Flow <= 12794.3 )
									ret := -0.166667
								if( Positive_Money_Flow > 12794.3 )
									ret := 0.250000
							if( Negative_Money_Flow_Sum > 315992 )
								if( Positive_Money_Flow_Sum <= 467012 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 467012 )
									ret := -0.166667
						if( Money_Flow_Ratio > 1.25838 )
							ret := 0.400000
					if( Negative_Money_Flow_Sum > 517755 )
						if( Typical_Price <= 2.62608 )
							ret := 0.500000
						if( Typical_Price > 2.62608 )
							if( MFI_Low <= 34.1685 )
								ret := 0.750000 // buy
							if( MFI_Low > 34.1685 )
								ret := 1.000000 // buy
				if( MFI > 56.3327 )
					if( Raw_Money_Flow <= 418353 )
						if( Raw_Money_Flow <= 53497.2 )
							if( MFI_Low <= 57.3642 )
								if( Positive_Money_Flow_Sum <= 650906 )
									ret := -0.027027
								if( Positive_Money_Flow_Sum > 650906 )
									ret := -0.469388
							if( MFI_Low > 57.3642 )
								if( Positive_Money_Flow_Sum <= 530670 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 530670 )
									ret := 0.727273 // buy
						if( Raw_Money_Flow > 53497.2 )
							if( Typical_Price <= 3.3006 )
								if( MFI_High <= -19.7007 )
									ret := 0.117647
								if( MFI_High > -19.7007 )
									ret := -0.530702
							if( Typical_Price > 3.3006 )
								if( Typical_Price <= 3.32651 )
									ret := 1.000000 // buy
								if( Typical_Price > 3.32651 )
									ret := -0.190476
					if( Raw_Money_Flow > 418353 )
						if( MFI_Low <= 68.6181 )
							if( Positive_Money_Flow <= 693085 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow > 693085 )
								ret := 0.250000
						if( MFI_Low > 68.6181 )
							if( Typical_Price <= 3.76126 )
								if( Positive_Money_Flow_Sum <= 3.60539e+06 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 3.60539e+06 )
									ret := -0.750000 // sell
							if( Typical_Price > 3.76126 )
								if( Negative_Money_Flow_Sum <= 414093 )
									ret := 0.714286 // buy
								if( Negative_Money_Flow_Sum > 414093 )
									ret := 0.000000
	if( Negative_Money_Flow_Sum > 569401 )
		if( Positive_Money_Flow_Sum <= 1.18248e+06 )
			if( Negative_Money_Flow_Sum <= 1.36882e+06 )
				if( Money_Flow_Ratio <= 0.585014 )
					if( MFI <= 32.6543 )
						if( Positive_Money_Flow_Sum <= 151104 )
							if( MFI <= 10.8243 )
								if( Raw_Money_Flow <= 175287 )
									ret := -0.176471
								if( Raw_Money_Flow > 175287 )
									ret := 0.750000 // buy
							if( MFI > 10.8243 )
								if( Typical_Price <= 1.51953 )
									ret := 0.384615
								if( Typical_Price > 1.51953 )
									ret := 0.795455 // buy
						if( Positive_Money_Flow_Sum > 151104 )
							if( Typical_Price <= 1.4333 )
								if( Negative_Money_Flow_Sum <= 893265 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 893265 )
									ret := -0.838710 // sell
							if( Typical_Price > 1.4333 )
								if( Negative_Money_Flow_Sum <= 644492 )
									ret := -0.357143
								if( Negative_Money_Flow_Sum > 644492 )
									ret := 0.187307
					if( MFI > 32.6543 )
						if( Typical_Price <= 2.1682 )
							if( Money_Flow_Ratio <= 0.529239 )
								if( Positive_Money_Flow_Sum <= 389914 )
									ret := 0.064516
								if( Positive_Money_Flow_Sum > 389914 )
									ret := -0.526316
							if( Money_Flow_Ratio > 0.529239 )
								if( Raw_Money_Flow <= 81047.5 )
									ret := -0.038462
								if( Raw_Money_Flow > 81047.5 )
									ret := 0.687500
						if( Typical_Price > 2.1682 )
							if( Positive_Money_Flow <= 157579 )
								if( Positive_Money_Flow_Sum <= 356948 )
									ret := -0.156250
								if( Positive_Money_Flow_Sum > 356948 )
									ret := -0.576642
							if( Positive_Money_Flow > 157579 )
								ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.585014 )
					if( MFI_Low <= 23.0098 )
						if( Positive_Money_Flow <= 23840.5 )
							if( Typical_Price <= 2.61024 )
								if( Positive_Money_Flow_Sum <= 436209 )
									ret := -0.166667
								if( Positive_Money_Flow_Sum > 436209 )
									ret := 0.461538
							if( Typical_Price > 2.61024 )
								if( Positive_Money_Flow_Sum <= 631469 )
									ret := -0.447368
								if( Positive_Money_Flow_Sum > 631469 )
									ret := 0.346154
						if( Positive_Money_Flow > 23840.5 )
							if( Raw_Money_Flow <= 56215.5 )
								if( Typical_Price <= 1.9308 )
									ret := 0.222222
								if( Typical_Price > 1.9308 )
									ret := 0.918033 // buy
							if( Raw_Money_Flow > 56215.5 )
								if( Positive_Money_Flow_Sum <= 565938 )
									ret := -0.105263
								if( Positive_Money_Flow_Sum > 565938 )
									ret := 0.703704 // buy
					if( MFI_Low > 23.0098 )
						if( Typical_Price <= 2.92199 )
							if( Positive_Money_Flow <= 115219 )
								if( Positive_Money_Flow_Sum <= 864937 )
									ret := -0.015038
								if( Positive_Money_Flow_Sum > 864937 )
									ret := 0.307292
							if( Positive_Money_Flow > 115219 )
								if( Negative_Money_Flow_Sum <= 662608 )
									ret := 0.895833 // buy
								if( Negative_Money_Flow_Sum > 662608 )
									ret := 0.448718
						if( Typical_Price > 2.92199 )
							if( Positive_Money_Flow_Sum <= 815677 )
								if( MFI_Low <= 31.4424 )
									ret := -0.500000
								if( MFI_Low > 31.4424 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 815677 )
								if( Raw_Money_Flow <= 78123.7 )
									ret := 0.435897
								if( Raw_Money_Flow > 78123.7 )
									ret := -0.162791
			if( Negative_Money_Flow_Sum > 1.36882e+06 )
				if( Typical_Price <= 3.48158 )
					if( MFI <= 11.4261 )
						if( Typical_Price <= 2.77724 )
							if( MFI_Low <= -11.2612 )
								if( Negative_Money_Flow_Sum <= 3.14792e+06 )
									ret := 0.368421
								if( Negative_Money_Flow_Sum > 3.14792e+06 )
									ret := 1.000000 // buy
							if( MFI_Low > -11.2612 )
								if( Negative_Money_Flow <= 359006 )
									ret := 0.400000
								if( Negative_Money_Flow > 359006 )
									ret := -0.750000 // sell
						if( Typical_Price > 2.77724 )
							if( Negative_Money_Flow_Sum <= 3.20638e+06 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.20638e+06 )
								ret := 1.000000 // buy
					if( MFI > 11.4261 )
						if( Negative_Money_Flow_Sum <= 2.36301e+06 )
							if( Positive_Money_Flow <= 128172 )
								if( MFI_High <= -37.2699 )
									ret := 0.465296
								if( MFI_High > -37.2699 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 128172 )
								if( MFI_High <= -44.7767 )
									ret := 0.125000
								if( MFI_High > -44.7767 )
									ret := -0.538462
						if( Negative_Money_Flow_Sum > 2.36301e+06 )
							if( MFI_Low <= -6.18184 )
								if( Typical_Price <= 2.93533 )
									ret := 1.000000 // buy
								if( Typical_Price > 2.93533 )
									ret := -0.600000
							if( MFI_Low > -6.18184 )
								if( Positive_Money_Flow <= 299687 )
									ret := 0.909910 // buy
								if( Positive_Money_Flow > 299687 )
									ret := 0.250000
				if( Typical_Price > 3.48158 )
					if( Typical_Price <= 3.87368 )
						if( Typical_Price <= 3.75487 )
							if( Positive_Money_Flow_Sum <= 469350 )
								if( Raw_Money_Flow <= 192311 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 192311 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 469350 )
								if( Money_Flow_Ratio <= 0.398759 )
									ret := 0.388889
								if( Money_Flow_Ratio > 0.398759 )
									ret := -0.250000
						if( Typical_Price > 3.75487 )
							if( Positive_Money_Flow_Sum <= 849175 )
								if( Raw_Money_Flow <= 282315 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 282315 )
									ret := -0.900000 // sell
							if( Positive_Money_Flow_Sum > 849175 )
								if( Negative_Money_Flow_Sum <= 2.99305e+06 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 2.99305e+06 )
									ret := -0.200000
					if( Typical_Price > 3.87368 )
						if( Positive_Money_Flow_Sum <= 928247 )
							if( Typical_Price <= 13.4079 )
								if( MFI_High <= -60.2701 )
									ret := 0.807018 // buy
								if( MFI_High > -60.2701 )
									ret := -0.062500
							if( Typical_Price > 13.4079 )
								if( Negative_Money_Flow_Sum <= 3.73378e+07 )
									ret := 0.020000
								if( Negative_Money_Flow_Sum > 3.73378e+07 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 928247 )
							if( Negative_Money_Flow_Sum <= 6.16788e+06 )
								if( Negative_Money_Flow_Sum <= 4.66091e+06 )
									ret := 0.141176
								if( Negative_Money_Flow_Sum > 4.66091e+06 )
									ret := -0.548387
							if( Negative_Money_Flow_Sum > 6.16788e+06 )
								if( Money_Flow_Ratio <= 0.157054 )
									ret := 0.333333
								if( Money_Flow_Ratio > 0.157054 )
									ret := 1.000000 // buy
		if( Positive_Money_Flow_Sum > 1.18248e+06 )
			if( Negative_Money_Flow <= 1.64387e+07 )
				if( Negative_Money_Flow_Sum <= 2.07339e+08 )
					if( Typical_Price <= 32.234 )
						if( Positive_Money_Flow_Sum <= 4.76131e+07 )
							if( Positive_Money_Flow_Sum <= 8.51787e+06 )
								if( Positive_Money_Flow <= 20.1074 )
									ret := -0.013825
								if( Positive_Money_Flow > 20.1074 )
									ret := 0.089372
							if( Positive_Money_Flow_Sum > 8.51787e+06 )
								if( Negative_Money_Flow_Sum <= 2.93789e+07 )
									ret := 0.091574
								if( Negative_Money_Flow_Sum > 2.93789e+07 )
									ret := 0.208165
						if( Positive_Money_Flow_Sum > 4.76131e+07 )
							if( Negative_Money_Flow_Sum <= 2.47561e+07 )
								if( Negative_Money_Flow_Sum <= 2.25031e+07 )
									ret := -0.173626
								if( Negative_Money_Flow_Sum > 2.25031e+07 )
									ret := -0.662651
							if( Negative_Money_Flow_Sum > 2.47561e+07 )
								if( Negative_Money_Flow_Sum <= 1.49936e+08 )
									ret := 0.031285
								if( Negative_Money_Flow_Sum > 1.49936e+08 )
									ret := -0.894737 // sell
					if( Typical_Price > 32.234 )
						if( MFI_Low <= 22.9979 )
							if( Raw_Money_Flow <= 8.90058e+06 )
								if( Typical_Price <= 41.2933 )
									ret := 0.039986
								if( Typical_Price > 41.2933 )
									ret := -0.051527
							if( Raw_Money_Flow > 8.90058e+06 )
								if( Positive_Money_Flow <= 1.20063e+07 )
									ret := 0.094374
								if( Positive_Money_Flow > 1.20063e+07 )
									ret := -0.120000
						if( MFI_Low > 22.9979 )
							if( Positive_Money_Flow_Sum <= 4.71563e+08 )
								if( Negative_Money_Flow_Sum <= 1.19077e+08 )
									ret := 0.048664
								if( Negative_Money_Flow_Sum > 1.19077e+08 )
									ret := -0.070517
							if( Positive_Money_Flow_Sum > 4.71563e+08 )
								if( Negative_Money_Flow_Sum <= 1.68519e+08 )
									ret := -0.660377
								if( Negative_Money_Flow_Sum > 1.68519e+08 )
									ret := 0.444444
				if( Negative_Money_Flow_Sum > 2.07339e+08 )
					if( Positive_Money_Flow_Sum <= 1.56649e+08 )
						if( Positive_Money_Flow_Sum <= 1.00478e+08 )
							if( Negative_Money_Flow <= 9.52653e+06 )
								if( MFI_Low <= 7.39882 )
									ret := 0.063953
								if( MFI_Low > 7.39882 )
									ret := -0.500000
							if( Negative_Money_Flow > 9.52653e+06 )
								if( Positive_Money_Flow_Sum <= 8.86969e+07 )
									ret := 0.456522
								if( Positive_Money_Flow_Sum > 8.86969e+07 )
									ret := 0.833333 // buy
						if( Positive_Money_Flow_Sum > 1.00478e+08 )
							if( Raw_Money_Flow <= 6.04525e+07 )
								if( Raw_Money_Flow <= 1.18231e+07 )
									ret := 0.305556
								if( Raw_Money_Flow > 1.18231e+07 )
									ret := 0.578704
							if( Raw_Money_Flow > 6.04525e+07 )
								ret := -0.800000 // sell
					if( Positive_Money_Flow_Sum > 1.56649e+08 )
						if( Typical_Price <= 124.116 )
							if( Typical_Price <= 102.052 )
								if( Positive_Money_Flow <= 2.49777e+07 )
									ret := 0.125000
								if( Positive_Money_Flow > 2.49777e+07 )
									ret := -0.700000 // sell
							if( Typical_Price > 102.052 )
								if( Money_Flow_Ratio <= 0.294135 )
									ret := -0.750000 // sell
								if( Money_Flow_Ratio > 0.294135 )
									ret := 0.654762
						if( Typical_Price > 124.116 )
							if( MFI_Low <= 12.0002 )
								if( Positive_Money_Flow <= 6.90151e+07 )
									ret := -0.757576 // sell
								if( Positive_Money_Flow > 6.90151e+07 )
									ret := -0.222222
							if( MFI_Low > 12.0002 )
								if( Typical_Price <= 188.468 )
									ret := 0.070826
								if( Typical_Price > 188.468 )
									ret := -0.276423
			if( Negative_Money_Flow > 1.64387e+07 )
				if( Typical_Price <= 139.122 )
					if( MFI_Low <= 7.25998 )
						if( Negative_Money_Flow_Sum <= 1.10777e+08 )
							if( Positive_Money_Flow_Sum <= 2.91071e+07 )
								if( Positive_Money_Flow_Sum <= 1.14148e+07 )
									ret := 0.636364
								if( Positive_Money_Flow_Sum > 1.14148e+07 )
									ret := -0.320000
							if( Positive_Money_Flow_Sum > 2.91071e+07 )
								if( Money_Flow_Ratio <= 0.310708 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.310708 )
									ret := 0.842105 // buy
						if( Negative_Money_Flow_Sum > 1.10777e+08 )
							if( Typical_Price <= 26.3452 )
								if( Typical_Price <= 24.3817 )
									ret := 0.600000
								if( Typical_Price > 24.3817 )
									ret := -0.777778 // sell
							if( Typical_Price > 26.3452 )
								if( Negative_Money_Flow_Sum <= 2.8491e+08 )
									ret := 0.525952
								if( Negative_Money_Flow_Sum > 2.8491e+08 )
									ret := 0.793103 // buy
					if( MFI_Low > 7.25998 )
						if( Raw_Money_Flow <= 2.96052e+07 )
							if( MFI_High <= -13.0008 )
								if( Money_Flow_Ratio <= 0.99955 )
									ret := 0.275229
								if( Money_Flow_Ratio > 0.99955 )
									ret := -0.036415
							if( MFI_High > -13.0008 )
								if( Money_Flow_Ratio <= 2.47207 )
									ret := 0.839506 // buy
								if( Money_Flow_Ratio > 2.47207 )
									ret := 0.171053
						if( Raw_Money_Flow > 2.96052e+07 )
							if( Positive_Money_Flow_Sum <= 2.85606e+08 )
								if( Money_Flow_Ratio <= 0.884986 )
									ret := -0.037383
								if( Money_Flow_Ratio > 0.884986 )
									ret := -0.324074
							if( Positive_Money_Flow_Sum > 2.85606e+08 )
								if( MFI <= 37.3293 )
									ret := -0.692308
								if( MFI > 37.3293 )
									ret := 0.439024
				if( Typical_Price > 139.122 )
					if( Money_Flow_Ratio <= 1.39074 )
						if( Negative_Money_Flow_Sum <= 1.23214e+08 )
							if( Negative_Money_Flow <= 3.24669e+07 )
								if( Raw_Money_Flow <= 2.26929e+07 )
									ret := -0.229437
								if( Raw_Money_Flow > 2.26929e+07 )
									ret := 0.035088
							if( Negative_Money_Flow > 3.24669e+07 )
								if( Typical_Price <= 189.496 )
									ret := -0.820513 // sell
								if( Typical_Price > 189.496 )
									ret := 0.500000
						if( Negative_Money_Flow_Sum > 1.23214e+08 )
							if( Typical_Price <= 181.075 )
								if( Positive_Money_Flow_Sum <= 3.0389e+08 )
									ret := 0.127130
								if( Positive_Money_Flow_Sum > 3.0389e+08 )
									ret := 0.415094
							if( Typical_Price > 181.075 )
								if( Positive_Money_Flow_Sum <= 2.10106e+08 )
									ret := 0.202020
								if( Positive_Money_Flow_Sum > 2.10106e+08 )
									ret := -0.400000
					if( Money_Flow_Ratio > 1.39074 )
						if( Negative_Money_Flow <= 1.80871e+07 )
							if( Negative_Money_Flow <= 1.76928e+07 )
								if( MFI_Low <= 44.3483 )
									ret := -0.411765
								if( MFI_Low > 44.3483 )
									ret := 0.214286
							if( Negative_Money_Flow > 1.76928e+07 )
								if( MFI_Low <= 49.3466 )
									ret := -0.400000
								if( MFI_Low > 49.3466 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.80871e+07 )
							if( Positive_Money_Flow_Sum <= 6.50675e+08 )
								if( Negative_Money_Flow_Sum <= 2.48555e+08 )
									ret := 0.324176
								if( Negative_Money_Flow_Sum > 2.48555e+08 )
									ret := -0.380952
							if( Positive_Money_Flow_Sum > 6.50675e+08 )
								if( Negative_Money_Flow_Sum <= 4.94023e+08 )
									ret := 0.956522 // buy
								if( Negative_Money_Flow_Sum > 4.94023e+08 )
									ret := 0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_SOLUSDT_30Min_804dae9d(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


