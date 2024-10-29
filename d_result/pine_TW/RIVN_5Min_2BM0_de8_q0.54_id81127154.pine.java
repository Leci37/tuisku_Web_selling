//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: RIVN_5Min_2BM0_81127154 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RIVN_5Min_2BM0_81127154", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RIVN_5Min_81127154(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 43.8749 )
		if( Positive_Money_Flow <= 948573 )
			if( bbm <= 0.050645 )
				if( bearPower <= 0.014237 )
					if( Positive_Money_Flow <= 130956 )
						if( Positive_Money_Flow_Sum <= 364791 )
							if( Raw_Money_Flow <= 37996.1 )
								if( bbp <= -0.083957 )
									ret := 0.182796
								if( bbp > -0.083957 )
									ret := -0.027172
							if( Raw_Money_Flow > 37996.1 )
								if( Negative_Money_Flow_Sum <= 322314 )
									ret := 0.029668
								if( Negative_Money_Flow_Sum > 322314 )
									ret := 0.180851
						if( Positive_Money_Flow_Sum > 364791 )
							if( bbm <= 0.030984 )
								if( Money_Flow_Ratio <= 0.7877 )
									ret := 0.022115
								if( Money_Flow_Ratio > 0.7877 )
									ret := -0.051464
							if( bbm > 0.030984 )
								if( Raw_Money_Flow <= 32867.7 )
									ret := 0.039604
								if( Raw_Money_Flow > 32867.7 )
									ret := -0.209790
					if( Positive_Money_Flow > 130956 )
						if( Negative_Money_Flow_Sum <= 556118 )
							if( bullPower <= 0.025302 )
								if( MFI_Low <= 53.8769 )
									ret := 0.208000
								if( MFI_Low > 53.8769 )
									ret := -0.090909
							if( bullPower > 0.025302 )
								if( Money_Flow_Ratio <= 1.10818 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 1.10818 )
									ret := 0.312102
						if( Negative_Money_Flow_Sum > 556118 )
							if( Money_Flow_Ratio <= 1.92243 )
								if( MFI_High <= -78.5649 )
									ret := 1.000000 // buy
								if( MFI_High > -78.5649 )
									ret := 0.050157
							if( Money_Flow_Ratio > 1.92243 )
								if( Positive_Money_Flow_Sum <= 1.9776e+06 )
									ret := -0.490196
								if( Positive_Money_Flow_Sum > 1.9776e+06 )
									ret := -0.055556
				if( bearPower > 0.014237 )
					if( Typical_Price <= 15.2277 )
						if( BBPower_Color <= 0.5 )
							if( Positive_Money_Flow <= 316144 )
								if( Positive_Money_Flow_Sum <= 546218 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 546218 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 316144 )
								ret := 0.200000
						if( BBPower_Color > 0.5 )
							if( Money_Flow_Ratio <= 14.1982 )
								if( Negative_Money_Flow_Sum <= 56280.4 )
									ret := -0.339623
								if( Negative_Money_Flow_Sum > 56280.4 )
									ret := -0.132964
							if( Money_Flow_Ratio > 14.1982 )
								if( MFI <= 93.5447 )
									ret := 1.000000 // buy
								if( MFI > 93.5447 )
									ret := 0.210526
					if( Typical_Price > 15.2277 )
						if( Negative_Money_Flow_Sum <= 245046 )
							if( bearPower <= 0.032912 )
								if( bearPower <= 0.021467 )
									ret := -0.086294
								if( bearPower > 0.021467 )
									ret := 0.132420
							if( bearPower > 0.032912 )
								if( Positive_Money_Flow_Sum <= 125545 )
									ret := -0.689655
								if( Positive_Money_Flow_Sum > 125545 )
									ret := -0.146283
						if( Negative_Money_Flow_Sum > 245046 )
							if( Positive_Money_Flow_Sum <= 1.96885e+06 )
								if( MFI <= 62.0002 )
									ret := 0.044597
								if( MFI > 62.0002 )
									ret := 0.230769
							if( Positive_Money_Flow_Sum > 1.96885e+06 )
								if( Positive_Money_Flow_Sum <= 5.06097e+06 )
									ret := -0.234973
								if( Positive_Money_Flow_Sum > 5.06097e+06 )
									ret := 0.078947
			if( bbm > 0.050645 )
				if( MFI <= 44.7486 )
					if( Positive_Money_Flow_Sum <= 2.83013e+06 )
						if( Positive_Money_Flow_Sum <= 755257 )
							if( Raw_Money_Flow <= 197124 )
								if( bullPower <= 0.096105 )
									ret := -0.191111
								if( bullPower > 0.096105 )
									ret := 0.447368
							if( Raw_Money_Flow > 197124 )
								if( bbm <= 0.059746 )
									ret := 0.928571 // buy
								if( bbm > 0.059746 )
									ret := 0.308642
						if( Positive_Money_Flow_Sum > 755257 )
							if( Money_Flow_Ratio <= 0.645303 )
								if( bearPower <= -0.033979 )
									ret := 0.049505
								if( bearPower > -0.033979 )
									ret := -0.382812
							if( Money_Flow_Ratio > 0.645303 )
								if( Typical_Price <= 16.1 )
									ret := 0.047619
								if( Typical_Price > 16.1 )
									ret := -0.722222 // sell
					if( Positive_Money_Flow_Sum > 2.83013e+06 )
						if( Positive_Money_Flow_Sum <= 1.87822e+07 )
							if( Raw_Money_Flow <= 517115 )
								if( bearPower <= -0.062637 )
									ret := -0.350000
								if( bearPower > -0.062637 )
									ret := 0.216216
							if( Raw_Money_Flow > 517115 )
								if( Typical_Price <= 25.7123 )
									ret := 0.585106
								if( Typical_Price > 25.7123 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 1.87822e+07 )
							if( Raw_Money_Flow <= 784593 )
								if( Typical_Price <= 10.6667 )
									ret := 0.750000 // buy
								if( Typical_Price > 10.6667 )
									ret := 0.020000
							if( Raw_Money_Flow > 784593 )
								if( Typical_Price <= 24.9682 )
									ret := -0.318182
								if( Typical_Price > 24.9682 )
									ret := -1.000000 // sell
				if( MFI > 44.7486 )
					if( Positive_Money_Flow <= 30517.5 )
						if( bullPower <= 0.121625 )
							if( Positive_Money_Flow_Sum <= 123418 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 123418 )
								if( bbp <= -0.051381 )
									ret := -0.411765
								if( bbp > -0.051381 )
									ret := 0.176471
						if( bullPower > 0.121625 )
							if( Typical_Price <= 20.47 )
								if( bbm <= 0.091064 )
									ret := 1.000000 // buy
								if( bbm > 0.091064 )
									ret := 0.750000 // buy
							if( Typical_Price > 20.47 )
								ret := -0.200000
					if( Positive_Money_Flow > 30517.5 )
						if( Positive_Money_Flow_Sum <= 273474 )
							if( Raw_Money_Flow <= 144146 )
								if( BBPower_Color <= 0.5 )
									ret := -0.952381 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.638298
							if( Raw_Money_Flow > 144146 )
								if( bullPower <= 0.148741 )
									ret := 0.090909
								if( bullPower > 0.148741 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 273474 )
							if( bbm <= 0.051508 )
								if( Negative_Money_Flow_Sum <= 1.79342e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.79342e+06 )
									ret := 0.000000
							if( bbm > 0.051508 )
								if( Typical_Price <= 24.0783 )
									ret := -0.183701
								if( Typical_Price > 24.0783 )
									ret := -0.011858
		if( Positive_Money_Flow > 948573 )
			if( Typical_Price <= 24.0543 )
				if( Raw_Money_Flow <= 8.79695e+06 )
					if( Positive_Money_Flow_Sum <= 1.84665e+08 )
						if( bbp <= 0.070954 )
							if( Money_Flow_Ratio <= 0.904015 )
								if( Negative_Money_Flow_Sum <= 2.69994e+07 )
									ret := 0.194002
								if( Negative_Money_Flow_Sum > 2.69994e+07 )
									ret := 0.091992
							if( Money_Flow_Ratio > 0.904015 )
								if( bbm <= 0.071573 )
									ret := 0.054665
								if( bbm > 0.071573 )
									ret := -0.081522
						if( bbp > 0.070954 )
							if( Negative_Money_Flow_Sum <= 6.52664e+07 )
								if( MFI_High <= -7.59715 )
									ret := 0.187832
								if( MFI_High > -7.59715 )
									ret := 0.063208
							if( Negative_Money_Flow_Sum > 6.52664e+07 )
								if( bbm <= 0.100972 )
									ret := -0.013699
								if( bbm > 0.100972 )
									ret := -0.482759
					if( Positive_Money_Flow_Sum > 1.84665e+08 )
						if( Positive_Money_Flow_Sum <= 4.2202e+08 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.2202e+08 )
							ret := 0.000000
				if( Raw_Money_Flow > 8.79695e+06 )
					if( MFI <= 84.5057 )
						if( Money_Flow_Ratio <= 1.20308 )
							if( Positive_Money_Flow_Sum <= 1.05066e+08 )
								if( Positive_Money_Flow_Sum <= 5.24611e+07 )
									ret := 0.068692
								if( Positive_Money_Flow_Sum > 5.24611e+07 )
									ret := -0.133681
							if( Positive_Money_Flow_Sum > 1.05066e+08 )
								if( Negative_Money_Flow_Sum <= 4.02867e+08 )
									ret := 0.453674
								if( Negative_Money_Flow_Sum > 4.02867e+08 )
									ret := -0.460000
						if( Money_Flow_Ratio > 1.20308 )
							if( Positive_Money_Flow <= 2.30576e+07 )
								if( MFI <= 76.1685 )
									ret := -0.216556
								if( MFI > 76.1685 )
									ret := 0.015945
							if( Positive_Money_Flow > 2.30576e+07 )
								if( Positive_Money_Flow_Sum <= 1.3557e+08 )
									ret := -0.183432
								if( Positive_Money_Flow_Sum > 1.3557e+08 )
									ret := 0.264214
					if( MFI > 84.5057 )
						if( Typical_Price <= 10.61 )
							if( Positive_Money_Flow <= 2.38111e+07 )
								if( MFI_Low <= 78.029 )
									ret := -0.857143 // sell
								if( MFI_Low > 78.029 )
									ret := 0.333333
							if( Positive_Money_Flow > 2.38111e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 10.61 )
							if( Money_Flow_Ratio <= 16.5628 )
								if( Negative_Money_Flow_Sum <= 5.75429e+07 )
									ret := 0.379433
								if( Negative_Money_Flow_Sum > 5.75429e+07 )
									ret := -0.750000 // sell
							if( Money_Flow_Ratio > 16.5628 )
								if( Money_Flow_Ratio <= 72.3899 )
									ret := 0.012346
								if( Money_Flow_Ratio > 72.3899 )
									ret := 0.430769
			if( Typical_Price > 24.0543 )
				if( Negative_Money_Flow_Sum <= 5.26761e+08 )
					if( Negative_Money_Flow_Sum <= 8.54794e+06 )
						if( Money_Flow_Ratio <= 28.6847 )
							if( bbp <= 0.644808 )
								if( bearPower <= -0.160014 )
									ret := -0.200000
								if( bearPower > -0.160014 )
									ret := 0.480000
							if( bbp > 0.644808 )
								ret := -1.000000 // sell
						if( Money_Flow_Ratio > 28.6847 )
							if( Typical_Price <= 25.0623 )
								ret := 0.500000
							if( Typical_Price > 25.0623 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 8.54794e+06 )
						if( Positive_Money_Flow_Sum <= 1.51938e+08 )
							if( bearPower <= 0.014178 )
								if( bullPower <= 0.227963 )
									ret := -0.168739
								if( bullPower > 0.227963 )
									ret := -0.685714
							if( bearPower > 0.014178 )
								if( bbp <= 0.376416 )
									ret := 0.239044
								if( bbp > 0.376416 )
									ret := -0.321429
						if( Positive_Money_Flow_Sum > 1.51938e+08 )
							if( Negative_Money_Flow_Sum <= 1.66216e+08 )
								if( MFI_High <= -0.068887 )
									ret := -0.639752
								if( MFI_High > -0.068887 )
									ret := -0.293478
							if( Negative_Money_Flow_Sum > 1.66216e+08 )
								if( Raw_Money_Flow <= 2.7504e+07 )
									ret := 0.469697
								if( Raw_Money_Flow > 2.7504e+07 )
									ret := -0.280488
				if( Negative_Money_Flow_Sum > 5.26761e+08 )
					if( MFI_Low <= 14.362 )
						ret := 1.000000 // buy
					if( MFI_Low > 14.362 )
						if( Typical_Price <= 25.0421 )
							ret := 1.000000 // buy
						if( Typical_Price > 25.0421 )
							ret := 0.500000
	if( Negative_Money_Flow > 43.8749 )
		if( Negative_Money_Flow <= 5.47502e+06 )
			if( bearPower <= -0.163965 )
				if( Negative_Money_Flow_Sum <= 2.89002e+07 )
					if( Negative_Money_Flow_Sum <= 6.12012e+06 )
						if( MFI_Low <= 10.2798 )
							if( Typical_Price <= 12.2589 )
								if( Negative_Money_Flow_Sum <= 5.05686e+06 )
									ret := -0.473684
								if( Negative_Money_Flow_Sum > 5.05686e+06 )
									ret := 1.000000 // buy
							if( Typical_Price > 12.2589 )
								if( Negative_Money_Flow_Sum <= 4.78512e+06 )
									ret := 0.492386
								if( Negative_Money_Flow_Sum > 4.78512e+06 )
									ret := 0.816327 // buy
						if( MFI_Low > 10.2798 )
							if( Typical_Price <= 23.6182 )
								if( Raw_Money_Flow <= 1.65189e+06 )
									ret := 0.181818
								if( Raw_Money_Flow > 1.65189e+06 )
									ret := -0.733333 // sell
							if( Typical_Price > 23.6182 )
								if( bullPower <= -0.075842 )
									ret := 0.285714
								if( bullPower > -0.075842 )
									ret := 0.705882 // buy
					if( Negative_Money_Flow_Sum > 6.12012e+06 )
						if( Negative_Money_Flow_Sum <= 8.41787e+06 )
							if( MFI_Low <= 41.4258 )
								if( Negative_Money_Flow_Sum <= 6.76159e+06 )
									ret := -0.090909
								if( Negative_Money_Flow_Sum > 6.76159e+06 )
									ret := -0.921569 // sell
							if( MFI_Low > 41.4258 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 8.41787e+06 )
							if( MFI_Low <= -5.03024 )
								if( Typical_Price <= 16.1269 )
									ret := 0.800000 // buy
								if( Typical_Price > 16.1269 )
									ret := 0.304348
							if( MFI_Low > -5.03024 )
								if( MFI_High <= -57.1433 )
									ret := -0.722222 // sell
								if( MFI_High > -57.1433 )
									ret := 0.106383
				if( Negative_Money_Flow_Sum > 2.89002e+07 )
					if( bbm <= 0.140357 )
						if( Typical_Price <= 25.3753 )
							if( bbp <= -0.324311 )
								if( bullPower <= -0.130411 )
									ret := 0.275862
								if( bullPower > -0.130411 )
									ret := -0.360000
							if( bbp > -0.324311 )
								if( Negative_Money_Flow_Sum <= 3.93852e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.93852e+07 )
									ret := 0.576577
						if( Typical_Price > 25.3753 )
							ret := -1.000000 // sell
					if( bbm > 0.140357 )
						if( Negative_Money_Flow_Sum <= 1.00546e+08 )
							if( bearPower <= -0.686517 )
								if( Raw_Money_Flow <= 3.92347e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 3.92347e+06 )
									ret := 1.000000 // buy
							if( bearPower > -0.686517 )
								if( Typical_Price <= 13.7921 )
									ret := 0.615385
								if( Typical_Price > 13.7921 )
									ret := 0.971429 // buy
						if( Negative_Money_Flow_Sum > 1.00546e+08 )
							if( Negative_Money_Flow <= 3.28836e+06 )
								if( MFI <= 33.7556 )
									ret := 0.458333
								if( MFI > 33.7556 )
									ret := -0.307692
							if( Negative_Money_Flow > 3.28836e+06 )
								if( Raw_Money_Flow <= 8.87483e+06 )
									ret := 0.400000
								if( Raw_Money_Flow > 8.87483e+06 )
									ret := 1.000000 // buy
			if( bearPower > -0.163965 )
				if( Typical_Price <= 18.8314 )
					if( bullPower <= -0.074135 )
						if( MFI <= 14.1389 )
							if( Negative_Money_Flow_Sum <= 3.0814e+07 )
								if( Negative_Money_Flow_Sum <= 1.95953e+06 )
									ret := 0.659574
								if( Negative_Money_Flow_Sum > 1.95953e+06 )
									ret := 0.206897
							if( Negative_Money_Flow_Sum > 3.0814e+07 )
								if( Negative_Money_Flow <= 3.63864e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 3.63864e+06 )
									ret := 0.714286 // buy
						if( MFI > 14.1389 )
							if( MFI_High <= -65.1826 )
								if( bullPower <= -0.09032 )
									ret := -1.000000 // sell
								if( bullPower > -0.09032 )
									ret := -0.750000 // sell
							if( MFI_High > -65.1826 )
								if( Negative_Money_Flow <= 4.17876e+06 )
									ret := 0.186441
								if( Negative_Money_Flow > 4.17876e+06 )
									ret := 0.569231
					if( bullPower > -0.074135 )
						if( Negative_Money_Flow_Sum <= 1.69039e+06 )
							if( bearPower <= -0.088959 )
								if( MFI_High <= -20.3082 )
									ret := 0.600000
								if( MFI_High > -20.3082 )
									ret := -0.320000
							if( bearPower > -0.088959 )
								if( bbm <= 0.04047 )
									ret := 0.104893
								if( bbm > 0.04047 )
									ret := 0.252414
						if( Negative_Money_Flow_Sum > 1.69039e+06 )
							if( bbm <= 0.1757 )
								if( bullPower <= -0.052751 )
									ret := -0.069725
								if( bullPower > -0.052751 )
									ret := 0.083197
							if( bbm > 0.1757 )
								if( bearPower <= -0.161825 )
									ret := -0.666667
								if( bearPower > -0.161825 )
									ret := 0.494624
				if( Typical_Price > 18.8314 )
					if( bullPower <= -0.011657 )
						if( bearPower <= -0.135281 )
							if( Negative_Money_Flow_Sum <= 3.41804e+06 )
								if( Negative_Money_Flow_Sum <= 283711 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 283711 )
									ret := 0.442623
							if( Negative_Money_Flow_Sum > 3.41804e+06 )
								if( Negative_Money_Flow_Sum <= 7.568e+06 )
									ret := -0.550000
								if( Negative_Money_Flow_Sum > 7.568e+06 )
									ret := 0.103093
						if( bearPower > -0.135281 )
							if( Positive_Money_Flow <= 1679.35 )
								if( Negative_Money_Flow_Sum <= 3.25196e+07 )
									ret := -0.005535
								if( Negative_Money_Flow_Sum > 3.25196e+07 )
									ret := -0.159218
							if( Positive_Money_Flow > 1679.35 )
								if( Raw_Money_Flow <= 157012 )
									ret := -0.672727
								if( Raw_Money_Flow > 157012 )
									ret := 0.000000
					if( bullPower > -0.011657 )
						if( Money_Flow_Ratio <= 0.780943 )
							if( Negative_Money_Flow_Sum <= 661337 )
								if( Negative_Money_Flow <= 9969.73 )
									ret := -0.367347
								if( Negative_Money_Flow > 9969.73 )
									ret := -0.031088
							if( Negative_Money_Flow_Sum > 661337 )
								if( MFI <= 18.3528 )
									ret := -0.114094
								if( MFI > 18.3528 )
									ret := 0.221644
						if( Money_Flow_Ratio > 0.780943 )
							if( Raw_Money_Flow <= 57767.5 )
								if( bullPower <= 0.051789 )
									ret := 0.078571
								if( bullPower > 0.051789 )
									ret := 0.322835
							if( Raw_Money_Flow > 57767.5 )
								if( Positive_Money_Flow_Sum <= 4.32076e+07 )
									ret := -0.061155
								if( Positive_Money_Flow_Sum > 4.32076e+07 )
									ret := 0.127135
		if( Negative_Money_Flow > 5.47502e+06 )
			if( bbm <= 0.091216 )
				if( Negative_Money_Flow_Sum <= 1.63504e+08 )
					if( Typical_Price <= 12.9425 )
						if( Money_Flow_Ratio <= 0.038102 )
							if( Raw_Money_Flow <= 8.81264e+06 )
								if( Negative_Money_Flow_Sum <= 4.93797e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.93797e+07 )
									ret := -0.750000 // sell
							if( Raw_Money_Flow > 8.81264e+06 )
								ret := -0.285714
						if( Money_Flow_Ratio > 0.038102 )
							if( MFI_High <= -70.8844 )
								if( Negative_Money_Flow <= 1.05932e+07 )
									ret := 0.892857 // buy
								if( Negative_Money_Flow > 1.05932e+07 )
									ret := 0.428571
							if( MFI_High > -70.8844 )
								if( Raw_Money_Flow <= 6.82884e+06 )
									ret := 0.188791
								if( Raw_Money_Flow > 6.82884e+06 )
									ret := -0.075145
					if( Typical_Price > 12.9425 )
						if( Typical_Price <= 20.6042 )
							if( MFI <= 28.864 )
								if( MFI_Low <= 4.64151 )
									ret := -0.232323
								if( MFI_Low > 4.64151 )
									ret := 0.391667
							if( MFI > 28.864 )
								if( MFI <= 36.0614 )
									ret := -0.458333
								if( MFI > 36.0614 )
									ret := -0.145299
						if( Typical_Price > 20.6042 )
							if( Positive_Money_Flow_Sum <= 3.30765e+07 )
								if( Positive_Money_Flow_Sum <= 1.42838e+07 )
									ret := -0.722222 // sell
								if( Positive_Money_Flow_Sum > 1.42838e+07 )
									ret := -0.131579
							if( Positive_Money_Flow_Sum > 3.30765e+07 )
								if( Typical_Price <= 24.6917 )
									ret := 0.284483
								if( Typical_Price > 24.6917 )
									ret := -0.213115
				if( Negative_Money_Flow_Sum > 1.63504e+08 )
					if( Positive_Money_Flow_Sum <= 1.29078e+07 )
						ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.29078e+07 )
						if( MFI_Low <= 5.36345 )
							if( bbm <= 0.08972 )
								ret := -1.000000 // sell
							if( bbm > 0.08972 )
								if( bbp <= -0.280317 )
									ret := 0.000000
								if( bbp > -0.280317 )
									ret := -1.000000 // sell
						if( MFI_Low > 5.36345 )
							if( Positive_Money_Flow_Sum <= 1.32501e+08 )
								if( Money_Flow_Ratio <= 0.538214 )
									ret := 0.538462
								if( Money_Flow_Ratio > 0.538214 )
									ret := -0.400000
							if( Positive_Money_Flow_Sum > 1.32501e+08 )
								if( MFI_Low <= 23.4401 )
									ret := -1.000000 // sell
								if( MFI_Low > 23.4401 )
									ret := -0.166667
			if( bbm > 0.091216 )
				if( Money_Flow_Ratio <= 0.033066 )
					if( Negative_Money_Flow_Sum <= 1.40975e+08 )
						if( Typical_Price <= 13.3139 )
							if( bearPower <= -0.352596 )
								ret := 1.000000 // buy
							if( bearPower > -0.352596 )
								if( Negative_Money_Flow <= 8.01017e+06 )
									ret := 0.500000
								if( Negative_Money_Flow > 8.01017e+06 )
									ret := -0.260870
						if( Typical_Price > 13.3139 )
							if( bbm <= 0.239994 )
								if( Typical_Price <= 22.9958 )
									ret := -0.683824
								if( Typical_Price > 22.9958 )
									ret := 0.428571
							if( bbm > 0.239994 )
								if( bullPower <= -0.250108 )
									ret := -0.888889 // sell
								if( bullPower > -0.250108 )
									ret := 0.235294
					if( Negative_Money_Flow_Sum > 1.40975e+08 )
						if( bullPower <= -0.240694 )
							if( Negative_Money_Flow <= 2.06684e+07 )
								ret := 0.666667
							if( Negative_Money_Flow > 2.06684e+07 )
								ret := 1.000000 // buy
						if( bullPower > -0.240694 )
							if( bearPower <= -0.333921 )
								ret := -1.000000 // sell
							if( bearPower > -0.333921 )
								ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.033066 )
					if( Negative_Money_Flow_Sum <= 2.70918e+07 )
						if( bearPower <= -0.288935 )
							if( bbp <= -0.416748 )
								if( MFI_High <= -34.7993 )
									ret := -0.466667
								if( MFI_High > -34.7993 )
									ret := 1.000000 // buy
							if( bbp > -0.416748 )
								if( bullPower <= 0.02709 )
									ret := 1.000000 // buy
								if( bullPower > 0.02709 )
									ret := 0.300000
						if( bearPower > -0.288935 )
							if( Negative_Money_Flow_Sum <= 9.55778e+06 )
								if( bbp <= 0.13822 )
									ret := 0.693333
								if( bbp > 0.13822 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 9.55778e+06 )
								if( Negative_Money_Flow <= 6.99099e+06 )
									ret := -0.389671
								if( Negative_Money_Flow > 6.99099e+06 )
									ret := -0.116054
					if( Negative_Money_Flow_Sum > 2.70918e+07 )
						if( Negative_Money_Flow_Sum <= 3.01449e+07 )
							if( bbm <= 0.147461 )
								if( Typical_Price <= 20.964 )
									ret := 0.783784 // buy
								if( Typical_Price > 20.964 )
									ret := 0.111111
							if( bbm > 0.147461 )
								if( Money_Flow_Ratio <= 2.94135 )
									ret := -0.028169
								if( Money_Flow_Ratio > 2.94135 )
									ret := 0.888889 // buy
						if( Negative_Money_Flow_Sum > 3.01449e+07 )
							if( bearPower <= 0.485077 )
								if( bearPower <= 0.206898 )
									ret := 0.075973
								if( bearPower > 0.206898 )
									ret := -0.385965
							if( bearPower > 0.485077 )
								ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_RIVN_5Min_81127154(bbm, bearPower, bbp, bullPower, BBPower_Color, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


