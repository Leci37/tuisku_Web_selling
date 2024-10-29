//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: MATICUSDT_30Min_2BM0_42ec260d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_2BM0_42ec260d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_42ec260d(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.013412 )
		if( Typical_Price <= 1.83079 )
			if( Negative_Money_Flow_Sum <= 9.72824e+07 )
				if( Raw_Money_Flow <= 2.27362e+06 )
					if( Typical_Price <= 0.381225 )
						if( Negative_Money_Flow_Sum <= 2.5407e+07 )
							if( Negative_Money_Flow_Sum <= 1.07395e+07 )
								if( MFI <= 37.7664 )
									ret := -0.375000
								if( MFI > 37.7664 )
									ret := 0.700000 // buy
							if( Negative_Money_Flow_Sum > 1.07395e+07 )
								if( bearPower <= -0.020748 )
									ret := 0.400000
								if( bearPower > -0.020748 )
									ret := 0.913043 // buy
						if( Negative_Money_Flow_Sum > 2.5407e+07 )
							if( Raw_Money_Flow <= 1.89954e+06 )
								ret := -0.833333 // sell
							if( Raw_Money_Flow > 1.89954e+06 )
								if( Typical_Price <= 0.323888 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.323888 )
									ret := 0.400000
					if( Typical_Price > 0.381225 )
						if( Negative_Money_Flow_Sum <= 1.05234e+07 )
							if( Money_Flow_Ratio <= 0.150185 )
								if( MFI_Low <= -9.07055 )
									ret := -0.615385
								if( MFI_Low > -9.07055 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.150185 )
								if( bearPower <= -0.017263 )
									ret := -0.347458
								if( bearPower > -0.017263 )
									ret := -0.012821
						if( Negative_Money_Flow_Sum > 1.05234e+07 )
							if( Positive_Money_Flow <= 931196 )
								if( Typical_Price <= 0.719003 )
									ret := 0.340136
								if( Typical_Price > 0.719003 )
									ret := 0.070288
							if( Positive_Money_Flow > 931196 )
								if( bbp <= -0.032943 )
									ret := 0.150000
								if( bbp > -0.032943 )
									ret := -0.105978
				if( Raw_Money_Flow > 2.27362e+06 )
					if( Negative_Money_Flow_Sum <= 5.09413e+07 )
						if( Positive_Money_Flow_Sum <= 7.82685e+06 )
							if( bbp <= -0.048731 )
								if( Positive_Money_Flow_Sum <= 5.02183e+06 )
									ret := 0.028169
								if( Positive_Money_Flow_Sum > 5.02183e+06 )
									ret := 0.510345
							if( bbp > -0.048731 )
								if( Typical_Price <= 0.355224 )
									ret := 0.769231 // buy
								if( Typical_Price > 0.355224 )
									ret := -0.001934
						if( Positive_Money_Flow_Sum > 7.82685e+06 )
							if( Raw_Money_Flow <= 9.56489e+06 )
								if( bbm <= 0.012653 )
									ret := 0.122478
								if( bbm > 0.012653 )
									ret := 0.253980
							if( Raw_Money_Flow > 9.56489e+06 )
								if( MFI <= 40.4912 )
									ret := 0.208791
								if( MFI > 40.4912 )
									ret := -0.250000
					if( Negative_Money_Flow_Sum > 5.09413e+07 )
						if( Positive_Money_Flow_Sum <= 2.16763e+07 )
							if( bbp <= -0.054461 )
								if( Negative_Money_Flow_Sum <= 5.52024e+07 )
									ret := -0.125000
								if( Negative_Money_Flow_Sum > 5.52024e+07 )
									ret := 0.613169
							if( bbp > -0.054461 )
								if( Raw_Money_Flow <= 4.08052e+06 )
									ret := -0.390625
								if( Raw_Money_Flow > 4.08052e+06 )
									ret := 0.166667
						if( Positive_Money_Flow_Sum > 2.16763e+07 )
							if( Typical_Price <= 1.0733 )
								if( MFI_High <= -25.4296 )
									ret := 0.237687
								if( MFI_High > -25.4296 )
									ret := -0.666667
							if( Typical_Price > 1.0733 )
								if( bullPower <= 0.020873 )
									ret := -0.090164
								if( bullPower > 0.020873 )
									ret := 0.410256
			if( Negative_Money_Flow_Sum > 9.72824e+07 )
				if( MFI <= 26.3812 )
					if( Negative_Money_Flow_Sum <= 2.49671e+08 )
						if( bbp <= -0.110399 )
							if( Negative_Money_Flow <= 4.6889e+07 )
								if( Negative_Money_Flow <= 8.42421e+06 )
									ret := 0.535714
								if( Negative_Money_Flow > 8.42421e+06 )
									ret := 0.844262 // buy
							if( Negative_Money_Flow > 4.6889e+07 )
								ret := 0.166667
						if( bbp > -0.110399 )
							if( Negative_Money_Flow <= 1.16352e+07 )
								if( Raw_Money_Flow <= 4.10768e+06 )
									ret := -0.166667
								if( Raw_Money_Flow > 4.10768e+06 )
									ret := 0.701389 // buy
							if( Negative_Money_Flow > 1.16352e+07 )
								if( Typical_Price <= 1.34625 )
									ret := 0.551724
								if( Typical_Price > 1.34625 )
									ret := -0.423077
					if( Negative_Money_Flow_Sum > 2.49671e+08 )
						if( bullPower <= -0.036535 )
							if( MFI_High <= -61.6285 )
								if( Raw_Money_Flow <= 4.30495e+07 )
									ret := 0.333333
								if( Raw_Money_Flow > 4.30495e+07 )
									ret := -0.666667
							if( MFI_High > -61.6285 )
								if( bbm <= 0.04926 )
									ret := 0.000000
								if( bbm > 0.04926 )
									ret := 0.941176 // buy
						if( bullPower > -0.036535 )
							if( bearPower <= -0.068556 )
								ret := -1.000000 // sell
							if( bearPower > -0.068556 )
								ret := 1.000000 // buy
				if( MFI > 26.3812 )
					if( Positive_Money_Flow_Sum <= 7.99549e+07 )
						if( Positive_Money_Flow_Sum <= 5.84124e+07 )
							if( bbp <= -0.062957 )
								if( Negative_Money_Flow_Sum <= 1.08444e+08 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 1.08444e+08 )
									ret := 0.795455 // buy
							if( bbp > -0.062957 )
								if( MFI_High <= -51.8065 )
									ret := -0.590909
								if( MFI_High > -51.8065 )
									ret := 0.357143
						if( Positive_Money_Flow_Sum > 5.84124e+07 )
							if( Positive_Money_Flow <= 91874.6 )
								if( MFI <= 38.8383 )
									ret := -0.219178
								if( MFI > 38.8383 )
									ret := 0.733333 // buy
							if( Positive_Money_Flow > 91874.6 )
								if( Raw_Money_Flow <= 6.62918e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 6.62918e+06 )
									ret := -0.756757 // sell
					if( Positive_Money_Flow_Sum > 7.99549e+07 )
						if( MFI_Low <= 29.685 )
							if( Typical_Price <= 1.48963 )
								if( Positive_Money_Flow <= 2.1564e+07 )
									ret := 0.718062 // buy
								if( Positive_Money_Flow > 2.1564e+07 )
									ret := -0.021739
							if( Typical_Price > 1.48963 )
								if( Positive_Money_Flow_Sum <= 1.87491e+08 )
									ret := 0.164134
								if( Positive_Money_Flow_Sum > 1.87491e+08 )
									ret := 0.697248
						if( MFI_Low > 29.685 )
							if( Negative_Money_Flow_Sum <= 2.41126e+08 )
								if( Positive_Money_Flow_Sum <= 1.81501e+08 )
									ret := 0.290698
								if( Positive_Money_Flow_Sum > 1.81501e+08 )
									ret := -0.167785
							if( Negative_Money_Flow_Sum > 2.41126e+08 )
								if( Positive_Money_Flow_Sum <= 1.03969e+09 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.03969e+09 )
									ret := -1.000000 // sell
		if( Typical_Price > 1.83079 )
			if( Negative_Money_Flow <= 4.24526e+07 )
				if( Negative_Money_Flow_Sum <= 1.26519e+08 )
					if( Negative_Money_Flow_Sum <= 5.67131e+07 )
						if( MFI_High <= -53.8091 )
							if( Positive_Money_Flow_Sum <= 8.26457e+06 )
								if( Raw_Money_Flow <= 2.5117e+06 )
									ret := 0.555556
								if( Raw_Money_Flow > 2.5117e+06 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 8.26457e+06 )
								if( bullPower <= -0.004957 )
									ret := -0.657534
								if( bullPower > -0.004957 )
									ret := 0.363636
						if( MFI_High > -53.8091 )
							if( Negative_Money_Flow_Sum <= 2.52323e+07 )
								if( Negative_Money_Flow_Sum <= 1.85885e+07 )
									ret := -0.238806
								if( Negative_Money_Flow_Sum > 1.85885e+07 )
									ret := 0.377778
							if( Negative_Money_Flow_Sum > 2.52323e+07 )
								if( bbp <= -0.010883 )
									ret := -0.066318
								if( bbp > -0.010883 )
									ret := -0.440000
					if( Negative_Money_Flow_Sum > 5.67131e+07 )
						if( Negative_Money_Flow_Sum <= 7.43532e+07 )
							if( Positive_Money_Flow_Sum <= 3.43929e+07 )
								if( bbp <= -0.086636 )
									ret := 0.492754
								if( bbp > -0.086636 )
									ret := -0.106796
							if( Positive_Money_Flow_Sum > 3.43929e+07 )
								if( Raw_Money_Flow <= 3.27066e+06 )
									ret := 0.900000 // buy
								if( Raw_Money_Flow > 3.27066e+06 )
									ret := 0.377778
						if( Negative_Money_Flow_Sum > 7.43532e+07 )
							if( Negative_Money_Flow_Sum <= 9.0686e+07 )
								if( Raw_Money_Flow <= 4.68812e+06 )
									ret := 0.562500
								if( Raw_Money_Flow > 4.68812e+06 )
									ret := -0.567568
							if( Negative_Money_Flow_Sum > 9.0686e+07 )
								if( bbm <= 0.047259 )
									ret := 0.007937
								if( bbm > 0.047259 )
									ret := 0.534091
				if( Negative_Money_Flow_Sum > 1.26519e+08 )
					if( Money_Flow_Ratio <= 0.517185 )
						if( Negative_Money_Flow <= 1.94684e+07 )
							if( Positive_Money_Flow_Sum <= 7.22179e+07 )
								if( bbm <= 0.042224 )
									ret := -0.200000
								if( bbm > 0.042224 )
									ret := -0.888889 // sell
							if( Positive_Money_Flow_Sum > 7.22179e+07 )
								if( bullPower <= -0.039812 )
									ret := -0.833333 // sell
								if( bullPower > -0.039812 )
									ret := 0.485714
						if( Negative_Money_Flow > 1.94684e+07 )
							if( Raw_Money_Flow <= 3.35816e+07 )
								if( bearPower <= -0.05891 )
									ret := 0.888889 // buy
								if( bearPower > -0.05891 )
									ret := -0.500000
							if( Raw_Money_Flow > 3.35816e+07 )
								if( bearPower <= -0.112074 )
									ret := -1.000000 // sell
								if( bearPower > -0.112074 )
									ret := 0.000000
					if( Money_Flow_Ratio > 0.517185 )
						if( Typical_Price <= 2.14903 )
							if( bbp <= 0.08529 )
								if( Typical_Price <= 1.83742 )
									ret := 0.153846
								if( Typical_Price > 1.83742 )
									ret := -0.594017
							if( bbp > 0.08529 )
								if( Positive_Money_Flow_Sum <= 4.25568e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 4.25568e+08 )
									ret := -0.500000
						if( Typical_Price > 2.14903 )
							if( Positive_Money_Flow_Sum <= 1.25001e+08 )
								if( bearPower <= -0.049552 )
									ret := -0.571429
								if( bearPower > -0.049552 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.25001e+08 )
								if( Positive_Money_Flow_Sum <= 2.2897e+08 )
									ret := 0.446809
								if( Positive_Money_Flow_Sum > 2.2897e+08 )
									ret := -0.395833
			if( Negative_Money_Flow > 4.24526e+07 )
				if( Positive_Money_Flow_Sum <= 6.58539e+08 )
					if( bbm <= 0.166215 )
						if( Positive_Money_Flow_Sum <= 4.16299e+08 )
							if( Positive_Money_Flow_Sum <= 2.36808e+08 )
								if( MFI_High <= -43.6539 )
									ret := 0.708333 // buy
								if( MFI_High > -43.6539 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.36808e+08 )
								if( Negative_Money_Flow <= 5.80684e+07 )
									ret := -0.500000
								if( Negative_Money_Flow > 5.80684e+07 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 4.16299e+08 )
							ret := 1.000000 // buy
					if( bbm > 0.166215 )
						ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 6.58539e+08 )
					if( bullPower <= 0.111403 )
						if( MFI_High <= -33.468 )
							if( bullPower <= 0.035056 )
								ret := -0.500000
							if( bullPower > 0.035056 )
								ret := -1.000000 // sell
						if( MFI_High > -33.468 )
							ret := 0.250000
					if( bullPower > 0.111403 )
						ret := 1.000000 // buy
	if( bearPower > -0.013412 )
		if( Typical_Price <= 0.361621 )
			if( MFI_Low <= 52.7988 )
				if( Positive_Money_Flow <= 1.65915e+06 )
					if( bbm <= 0.000124 )
						if( bearPower <= -0.000266 )
							if( Typical_Price <= 0.015056 )
								if( Typical_Price <= 0.013645 )
									ret := -0.250000
								if( Typical_Price > 0.013645 )
									ret := -1.000000 // sell
							if( Typical_Price > 0.015056 )
								if( bbp <= -0.000652 )
									ret := -0.666667
								if( bbp > -0.000652 )
									ret := -0.090909
						if( bearPower > -0.000266 )
							if( Negative_Money_Flow_Sum <= 1.61981e+06 )
								if( bearPower <= -1e-06 )
									ret := 0.066779
								if( bearPower > -1e-06 )
									ret := -0.072407
							if( Negative_Money_Flow_Sum > 1.61981e+06 )
								if( Raw_Money_Flow <= 32224.3 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 32224.3 )
									ret := -0.500000
					if( bbm > 0.000124 )
						if( bearPower <= -0.006548 )
							if( Positive_Money_Flow_Sum <= 1.7826e+06 )
								if( bullPower <= -0.002543 )
									ret := -1.000000 // sell
								if( bullPower > -0.002543 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.7826e+06 )
								if( Negative_Money_Flow <= 505697 )
									ret := 0.131148
								if( Negative_Money_Flow > 505697 )
									ret := 0.496855
						if( bearPower > -0.006548 )
							if( Positive_Money_Flow_Sum <= 918665 )
								if( Typical_Price <= 0.021189 )
									ret := 0.168522
								if( Typical_Price > 0.021189 )
									ret := 0.451220
							if( Positive_Money_Flow_Sum > 918665 )
								if( Typical_Price <= 0.023357 )
									ret := -0.053719
								if( Typical_Price > 0.023357 )
									ret := 0.134308
				if( Positive_Money_Flow > 1.65915e+06 )
					if( Positive_Money_Flow_Sum <= 2.15868e+07 )
						if( Positive_Money_Flow_Sum <= 9.87522e+06 )
							if( Positive_Money_Flow <= 1.75515e+06 )
								if( Positive_Money_Flow_Sum <= 7.70439e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 7.70439e+06 )
									ret := -0.500000
							if( Positive_Money_Flow > 1.75515e+06 )
								if( bbp <= -0.009394 )
									ret := -0.800000 // sell
								if( bbp > -0.009394 )
									ret := 0.203390
						if( Positive_Money_Flow_Sum > 9.87522e+06 )
							if( bbm <= 0.00953 )
								if( MFI <= 64.1667 )
									ret := -0.449275
								if( MFI > 64.1667 )
									ret := -0.820513 // sell
							if( bbm > 0.00953 )
								if( Positive_Money_Flow_Sum <= 1.92861e+07 )
									ret := -0.322581
								if( Positive_Money_Flow_Sum > 1.92861e+07 )
									ret := 0.411765
					if( Positive_Money_Flow_Sum > 2.15868e+07 )
						if( Positive_Money_Flow_Sum <= 3.23655e+07 )
							if( MFI_Low <= 20.2856 )
								if( Typical_Price <= 0.27905 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.27905 )
									ret := 0.200000
							if( MFI_Low > 20.2856 )
								if( bearPower <= -0.0006 )
									ret := 0.846154 // buy
								if( bearPower > -0.0006 )
									ret := 0.346939
						if( Positive_Money_Flow_Sum > 3.23655e+07 )
							if( Positive_Money_Flow_Sum <= 6.69815e+07 )
								if( bullPower <= 0.007345 )
									ret := 0.166667
								if( bullPower > 0.007345 )
									ret := -0.514706
							if( Positive_Money_Flow_Sum > 6.69815e+07 )
								ret := 1.000000 // buy
			if( MFI_Low > 52.7988 )
				if( Positive_Money_Flow <= 23922.3 )
					if( Negative_Money_Flow_Sum <= 222823 )
						if( bbm <= 0.000182 )
							if( MFI <= 77.293 )
								if( Positive_Money_Flow_Sum <= 533400 )
									ret := -0.069444
								if( Positive_Money_Flow_Sum > 533400 )
									ret := -0.750000 // sell
							if( MFI > 77.293 )
								if( Typical_Price <= 0.016233 )
									ret := 0.692308
								if( Typical_Price > 0.016233 )
									ret := 0.155556
						if( bbm > 0.000182 )
							if( bullPower <= 0.000251 )
								if( bullPower <= 0.000203 )
									ret := -0.363636
								if( bullPower > 0.000203 )
									ret := 0.142857
							if( bullPower > 0.000251 )
								if( Negative_Money_Flow_Sum <= 158447 )
									ret := -0.444444
								if( Negative_Money_Flow_Sum > 158447 )
									ret := -0.933333 // sell
					if( Negative_Money_Flow_Sum > 222823 )
						if( bullPower <= 0.018945 )
							if( bbp <= 0.00654 )
								if( MFI <= 74.7952 )
									ret := 0.702128 // buy
								if( MFI > 74.7952 )
									ret := 0.228814
							if( bbp > 0.00654 )
								if( Money_Flow_Ratio <= 3.33581 )
									ret := -0.692308
								if( Money_Flow_Ratio > 3.33581 )
									ret := 0.666667
						if( bullPower > 0.018945 )
							ret := 1.000000 // buy
				if( Positive_Money_Flow > 23922.3 )
					if( MFI_High <= -5.67588 )
						if( bbp <= 0.000214 )
							if( bearPower <= -2e-06 )
								if( MFI <= 73.7909 )
									ret := 0.857143 // buy
								if( MFI > 73.7909 )
									ret := 0.000000
							if( bearPower > -2e-06 )
								ret := -0.200000
						if( bbp > 0.000214 )
							if( Typical_Price <= 0.036938 )
								if( Typical_Price <= 0.017722 )
									ret := 0.200000
								if( Typical_Price > 0.017722 )
									ret := -0.735632 // sell
							if( Typical_Price > 0.036938 )
								if( Negative_Money_Flow_Sum <= 4.92518e+06 )
									ret := 0.444444
								if( Negative_Money_Flow_Sum > 4.92518e+06 )
									ret := -0.761905 // sell
					if( MFI_High > -5.67588 )
						if( Negative_Money_Flow <= 19259.4 )
							if( Money_Flow_Ratio <= 13.3289 )
								if( MFI <= 79.8927 )
									ret := -0.118644
								if( MFI > 79.8927 )
									ret := -0.335366
							if( Money_Flow_Ratio > 13.3289 )
								if( Money_Flow_Ratio <= 20.6626 )
									ret := 0.500000
								if( Money_Flow_Ratio > 20.6626 )
									ret := 0.800000 // buy
						if( Negative_Money_Flow > 19259.4 )
							if( bbm <= 0.00146 )
								if( MFI_Low <= 57.4104 )
									ret := 0.200000
								if( MFI_Low > 57.4104 )
									ret := 1.000000 // buy
							if( bbm > 0.00146 )
								if( Raw_Money_Flow <= 445046 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 445046 )
									ret := -0.500000
		if( Typical_Price > 0.361621 )
			if( Positive_Money_Flow_Sum <= 1.42662e+08 )
				if( Money_Flow_Ratio <= 0.49433 )
					if( Negative_Money_Flow <= 2.78322e+06 )
						if( bbm <= 0.011501 )
							if( Positive_Money_Flow_Sum <= 7.46664e+06 )
								if( Negative_Money_Flow_Sum <= 3.14262e+07 )
									ret := -0.032592
								if( Negative_Money_Flow_Sum > 3.14262e+07 )
									ret := -0.722222 // sell
							if( Positive_Money_Flow_Sum > 7.46664e+06 )
								if( Positive_Money_Flow_Sum <= 1.66451e+07 )
									ret := 0.102890
								if( Positive_Money_Flow_Sum > 1.66451e+07 )
									ret := -0.338462
						if( bbm > 0.011501 )
							if( Negative_Money_Flow_Sum <= 2.47689e+07 )
								if( Positive_Money_Flow_Sum <= 5.49245e+06 )
									ret := -0.014706
								if( Positive_Money_Flow_Sum > 5.49245e+06 )
									ret := -0.568182
							if( Negative_Money_Flow_Sum > 2.47689e+07 )
								if( Positive_Money_Flow_Sum <= 2.12558e+07 )
									ret := 0.155844
								if( Positive_Money_Flow_Sum > 2.12558e+07 )
									ret := -0.520000
					if( Negative_Money_Flow > 2.78322e+06 )
						if( Positive_Money_Flow_Sum <= 5.05561e+06 )
							if( Typical_Price <= 0.969778 )
								if( Negative_Money_Flow <= 5.02599e+06 )
									ret := 0.058824
								if( Negative_Money_Flow > 5.02599e+06 )
									ret := -0.750000 // sell
							if( Typical_Price > 0.969778 )
								ret := -0.800000 // sell
						if( Positive_Money_Flow_Sum > 5.05561e+06 )
							if( Negative_Money_Flow_Sum <= 7.81895e+07 )
								if( MFI_Low <= 12.4224 )
									ret := 0.479339
								if( MFI_Low > 12.4224 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 7.81895e+07 )
								if( Raw_Money_Flow <= 7.40858e+06 )
									ret := -0.647059
								if( Raw_Money_Flow > 7.40858e+06 )
									ret := 0.461538
				if( Money_Flow_Ratio > 0.49433 )
					if( Negative_Money_Flow_Sum <= 6.68097e+07 )
						if( bbm <= 0.066432 )
							if( Typical_Price <= 0.920319 )
								if( Positive_Money_Flow_Sum <= 2.32895e+07 )
									ret := 0.025315
								if( Positive_Money_Flow_Sum > 2.32895e+07 )
									ret := 0.131032
							if( Typical_Price > 0.920319 )
								if( Positive_Money_Flow_Sum <= 1.27536e+08 )
									ret := 0.000682
								if( Positive_Money_Flow_Sum > 1.27536e+08 )
									ret := 0.368421
						if( bbm > 0.066432 )
							if( Money_Flow_Ratio <= 1.23181 )
								ret := 0.800000 // buy
							if( Money_Flow_Ratio > 1.23181 )
								if( Raw_Money_Flow <= 2.81706e+07 )
									ret := -0.838710 // sell
								if( Raw_Money_Flow > 2.81706e+07 )
									ret := -0.400000
					if( Negative_Money_Flow_Sum > 6.68097e+07 )
						if( MFI <= 61.8213 )
							if( MFI_Low <= 36.994 )
								if( Raw_Money_Flow <= 4.97715e+06 )
									ret := 0.586207
								if( Raw_Money_Flow > 4.97715e+06 )
									ret := 0.079505
							if( MFI_Low > 36.994 )
								if( bbm <= 0.044513 )
									ret := -0.522388
								if( bbm > 0.044513 )
									ret := 0.666667
						if( MFI > 61.8213 )
							if( Typical_Price <= 1.11542 )
								if( Negative_Money_Flow <= 9.28904e+06 )
									ret := -0.923077 // sell
								if( Negative_Money_Flow > 9.28904e+06 )
									ret := 0.500000
							if( Typical_Price > 1.11542 )
								if( bbp <= 0.080632 )
									ret := 0.924242 // buy
								if( bbp > 0.080632 )
									ret := 0.250000
			if( Positive_Money_Flow_Sum > 1.42662e+08 )
				if( Money_Flow_Ratio <= 2.95923 )
					if( Positive_Money_Flow <= 8.59202e+07 )
						if( Typical_Price <= 0.913492 )
							if( MFI_High <= -12.0953 )
								if( Positive_Money_Flow_Sum <= 1.4514e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.4514e+08 )
									ret := 0.619718
							if( MFI_High > -12.0953 )
								if( Positive_Money_Flow <= 2.13324e+07 )
									ret := -0.375000
								if( Positive_Money_Flow > 2.13324e+07 )
									ret := -1.000000 // sell
						if( Typical_Price > 0.913492 )
							if( bullPower <= 0.026452 )
								if( Negative_Money_Flow_Sum <= 8.47099e+07 )
									ret := 0.941176 // buy
								if( Negative_Money_Flow_Sum > 8.47099e+07 )
									ret := -0.210526
							if( bullPower > 0.026452 )
								if( MFI_Low <= 30.1363 )
									ret := 0.016667
								if( MFI_Low > 30.1363 )
									ret := -0.518519
					if( Positive_Money_Flow > 8.59202e+07 )
						if( Typical_Price <= 2.3472 )
							if( MFI <= 71.927 )
								ret := 1.000000 // buy
							if( MFI > 71.927 )
								ret := 0.250000
						if( Typical_Price > 2.3472 )
							ret := -0.800000 // sell
				if( Money_Flow_Ratio > 2.95923 )
					if( Positive_Money_Flow_Sum <= 2.0755e+08 )
						if( Typical_Price <= 1.4698 )
							if( Negative_Money_Flow_Sum <= 4.59253e+07 )
								if( Positive_Money_Flow_Sum <= 1.47505e+08 )
									ret := 0.478261
								if( Positive_Money_Flow_Sum > 1.47505e+08 )
									ret := -0.549020
							if( Negative_Money_Flow_Sum > 4.59253e+07 )
								if( Positive_Money_Flow_Sum <= 1.86745e+08 )
									ret := 0.756757 // buy
								if( Positive_Money_Flow_Sum > 1.86745e+08 )
									ret := 0.000000
						if( Typical_Price > 1.4698 )
							if( Positive_Money_Flow_Sum <= 1.60389e+08 )
								if( bearPower <= 0.02957 )
									ret := 0.407407
								if( bearPower > 0.02957 )
									ret := -0.562500
							if( Positive_Money_Flow_Sum > 1.60389e+08 )
								if( MFI_High <= 0.010993 )
									ret := -0.513514
								if( MFI_High > 0.010993 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 2.0755e+08 )
						if( bbm <= 0.130941 )
							if( Negative_Money_Flow_Sum <= 4.77956e+07 )
								if( bbp <= 0.209112 )
									ret := -0.260870
								if( bbp > 0.209112 )
									ret := 0.833333 // buy
							if( Negative_Money_Flow_Sum > 4.77956e+07 )
								if( Typical_Price <= 0.710343 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.710343 )
									ret := 0.670732
						if( bbm > 0.130941 )
							if( MFI_High <= -0.009529 )
								ret := -0.166667
							if( MFI_High > -0.009529 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_MATICUSDT_30Min_42ec260d(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


