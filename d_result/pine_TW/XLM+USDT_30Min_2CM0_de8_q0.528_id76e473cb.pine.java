//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: XLMUSDT_30Min_2CM0_76e473cb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2CM0_76e473cb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_76e473cb(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( MFI_Low <= 35.2618 )
		if( Negative_Money_Flow_Sum <= 3.12384e+07 )
			if( Positive_Money_Flow <= 3.44244e+06 )
				if( ad <= -2.55914e+06 )
					if( MFI_High <= -52.91 )
						if( Typical_Price <= 0.132638 )
							if( Raw_Money_Flow <= 430715 )
								if( ad <= -2.86653e+06 )
									ret := -0.381818
								if( ad > -2.86653e+06 )
									ret := 0.867647 // buy
							if( Raw_Money_Flow > 430715 )
								if( ad <= -3.02848e+06 )
									ret := 0.622807
								if( ad > -3.02848e+06 )
									ret := 0.104167
						if( Typical_Price > 0.132638 )
							if( MFI <= 17.0555 )
								if( MFI_High <= -68.1679 )
									ret := 0.140000
								if( MFI_High > -68.1679 )
									ret := -0.325843
							if( MFI > 17.0555 )
								if( Typical_Price <= 0.236117 )
									ret := 0.024793
								if( Typical_Price > 0.236117 )
									ret := 0.433333
					if( MFI_High > -52.91 )
						if( MFI_Low <= 15.769 )
							if( ad_mf <= -6.1195e+06 )
								if( Positive_Money_Flow_Sum <= 5.81336e+06 )
									ret := -0.586538
								if( Positive_Money_Flow_Sum > 5.81336e+06 )
									ret := 0.116667
							if( ad_mf > -6.1195e+06 )
								if( Positive_Money_Flow_Sum <= 1.17646e+07 )
									ret := 0.077532
								if( Positive_Money_Flow_Sum > 1.17646e+07 )
									ret := -0.735294 // sell
						if( MFI_Low > 15.769 )
							if( Positive_Money_Flow_Sum <= 4.76309e+06 )
								if( Money_Flow_Ratio <= 0.760003 )
									ret := 0.176309
								if( Money_Flow_Ratio > 0.760003 )
									ret := -0.248521
							if( Positive_Money_Flow_Sum > 4.76309e+06 )
								if( ad <= -1.48451e+07 )
									ret := -0.466667
								if( ad > -1.48451e+07 )
									ret := 0.246761
				if( ad > -2.55914e+06 )
					if( ad_mf <= 0.121325 )
						if( ad <= -606892 )
							if( Positive_Money_Flow <= 2.18135e+06 )
								if( Typical_Price <= 0.399179 )
									ret := 0.013452
								if( Typical_Price > 0.399179 )
									ret := -0.223183
							if( Positive_Money_Flow > 2.18135e+06 )
								if( MFI <= 37.4683 )
									ret := -0.333333
								if( MFI > 37.4683 )
									ret := 0.740260 // buy
						if( ad > -606892 )
							if( Positive_Money_Flow_Sum <= 2.04318e+06 )
								if( MFI_High <= -48.0326 )
									ret := 0.125309
								if( MFI_High > -48.0326 )
									ret := 0.036029
							if( Positive_Money_Flow_Sum > 2.04318e+06 )
								if( MFI <= 35.4742 )
									ret := 0.321370
								if( MFI > 35.4742 )
									ret := 0.124782
					if( ad_mf > 0.121325 )
						if( MFI_High <= -26.5706 )
							if( Positive_Money_Flow <= 1.86173e+06 )
								if( MFI_Low <= -11.752 )
									ret := -0.306122
								if( MFI_Low > -11.752 )
									ret := -0.011030
							if( Positive_Money_Flow > 1.86173e+06 )
								if( MFI_Low <= 2.84369 )
									ret := -0.862069 // sell
								if( MFI_Low > 2.84369 )
									ret := -0.156969
						if( MFI_High > -26.5706 )
							if( Positive_Money_Flow <= 1.22162e+06 )
								if( Raw_Money_Flow <= 217002 )
									ret := 0.002551
								if( Raw_Money_Flow > 217002 )
									ret := 0.204272
							if( Positive_Money_Flow > 1.22162e+06 )
								if( Raw_Money_Flow <= 1.44081e+06 )
									ret := 0.849057 // buy
								if( Raw_Money_Flow > 1.44081e+06 )
									ret := 0.275362
			if( Positive_Money_Flow > 3.44244e+06 )
				if( MFI_Low <= 25.8635 )
					if( Money_Flow_Ratio <= 0.528877 )
						if( ad_mf <= 1.57381e+07 )
							ret := 0.142857
						if( ad_mf > 1.57381e+07 )
							ret := 1.000000 // buy
					if( Money_Flow_Ratio > 0.528877 )
						if( ad <= 5.04029e+06 )
							if( Positive_Money_Flow <= 3.91481e+06 )
								ret := 0.619048
							if( Positive_Money_Flow > 3.91481e+06 )
								ret := -0.466667
						if( ad > 5.04029e+06 )
							if( MFI_High <= -37.167 )
								ret := -0.090909
							if( MFI_High > -37.167 )
								ret := -0.882353 // sell
				if( MFI_Low > 25.8635 )
					if( Positive_Money_Flow <= 5.14158e+06 )
						if( Negative_Money_Flow_Sum <= 1.69203e+07 )
							if( Raw_Money_Flow <= 3.80635e+06 )
								ret := -0.400000
							if( Raw_Money_Flow > 3.80635e+06 )
								ret := 0.611111
						if( Negative_Money_Flow_Sum > 1.69203e+07 )
							if( Positive_Money_Flow_Sum <= 1.7382e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.7382e+07 )
								if( ad_mf <= -357878 )
									ret := 0.222222
								if( ad_mf > -357878 )
									ret := 0.662921
					if( Positive_Money_Flow > 5.14158e+06 )
						if( MFI_Low <= 33.7413 )
							ret := -0.812500 // sell
						if( MFI_Low > 33.7413 )
							if( Positive_Money_Flow_Sum <= 3.21381e+07 )
								ret := -0.052632
							if( Positive_Money_Flow_Sum > 3.21381e+07 )
								ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 3.12384e+07 )
			if( Money_Flow_Ratio <= 0.368339 )
				if( Raw_Money_Flow <= 4.39708e+06 )
					if( Negative_Money_Flow_Sum <= 3.80031e+07 )
						if( Money_Flow_Ratio <= 0.129557 )
							ret := -0.600000
						if( Money_Flow_Ratio > 0.129557 )
							if( Money_Flow_Ratio <= 0.319532 )
								if( MFI_High <= -63.606 )
									ret := 0.578947
								if( MFI_High > -63.606 )
									ret := 0.942029 // buy
							if( Money_Flow_Ratio > 0.319532 )
								if( Negative_Money_Flow_Sum <= 3.21111e+07 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 3.21111e+07 )
									ret := 0.571429
					if( Negative_Money_Flow_Sum > 3.80031e+07 )
						if( MFI_High <= -58.8822 )
							if( ad_mf <= -4.27024e+06 )
								ret := -1.000000 // sell
							if( ad_mf > -4.27024e+06 )
								if( Negative_Money_Flow <= 3.51193e+06 )
									ret := -0.500000
								if( Negative_Money_Flow > 3.51193e+06 )
									ret := 0.363636
						if( MFI_High > -58.8822 )
							if( Typical_Price <= 0.53192 )
								if( Positive_Money_Flow <= 2.37012e+06 )
									ret := 0.537037
								if( Positive_Money_Flow > 2.37012e+06 )
									ret := -0.363636
							if( Typical_Price > 0.53192 )
								if( MFI_Low <= 4.22661 )
									ret := -0.708333 // sell
								if( MFI_Low > 4.22661 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 4.39708e+06 )
					if( MFI_Low <= 2.42634 )
						if( ad_mf <= 4.85261e+06 )
							if( Typical_Price <= 0.444895 )
								ret := 1.000000 // buy
							if( Typical_Price > 0.444895 )
								if( MFI <= 20.9672 )
									ret := 0.436364
								if( MFI > 20.9672 )
									ret := -0.500000
						if( ad_mf > 4.85261e+06 )
							if( Negative_Money_Flow <= 1.46189e+07 )
								if( Typical_Price <= 0.653503 )
									ret := -0.288889
								if( Typical_Price > 0.653503 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow > 1.46189e+07 )
								ret := 0.250000
					if( MFI_Low > 2.42634 )
						if( ad_mf <= 7.96907e+06 )
							if( Typical_Price <= 0.648848 )
								if( Raw_Money_Flow <= 5.34692e+06 )
									ret := 0.285714
								if( Raw_Money_Flow > 5.34692e+06 )
									ret := 1.000000 // buy
							if( Typical_Price > 0.648848 )
								ret := 0.000000
						if( ad_mf > 7.96907e+06 )
							if( Positive_Money_Flow_Sum <= 2.99629e+07 )
								if( Raw_Money_Flow <= 9.60871e+06 )
									ret := 0.264706
								if( Raw_Money_Flow > 9.60871e+06 )
									ret := -0.923077 // sell
							if( Positive_Money_Flow_Sum > 2.99629e+07 )
								ret := 1.000000 // buy
			if( Money_Flow_Ratio > 0.368339 )
				if( Negative_Money_Flow <= 4.95103e+06 )
					if( mf <= 0.080059 )
						if( ad <= -9.90186e+06 )
							if( Raw_Money_Flow <= 1.02275e+07 )
								if( Money_Flow_Ratio <= 0.970365 )
									ret := 0.457143
								if( Money_Flow_Ratio > 0.970365 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 1.02275e+07 )
								ret := -0.333333
						if( ad > -9.90186e+06 )
							if( Positive_Money_Flow_Sum <= 5.91168e+07 )
								if( Positive_Money_Flow_Sum <= 2.24179e+07 )
									ret := -0.135747
								if( Positive_Money_Flow_Sum > 2.24179e+07 )
									ret := -0.446181
							if( Positive_Money_Flow_Sum > 5.91168e+07 )
								if( MFI_Low <= 16.5124 )
									ret := -1.000000 // sell
								if( MFI_Low > 16.5124 )
									ret := 0.182796
					if( mf > 0.080059 )
						if( Positive_Money_Flow <= 4.80468e+06 )
							if( MFI <= 43.0994 )
								if( Negative_Money_Flow_Sum <= 3.62746e+07 )
									ret := 0.131579
								if( Negative_Money_Flow_Sum > 3.62746e+07 )
									ret := 0.720000 // buy
							if( MFI > 43.0994 )
								if( Typical_Price <= 0.34207 )
									ret := -0.600000
								if( Typical_Price > 0.34207 )
									ret := 0.099099
						if( Positive_Money_Flow > 4.80468e+06 )
							if( ad <= 2.82605e+07 )
								if( ad <= -5.36981e+06 )
									ret := 0.636364
								if( ad > -5.36981e+06 )
									ret := -0.119469
							if( ad > 2.82605e+07 )
								if( Raw_Money_Flow <= 1.1901e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.1901e+07 )
									ret := -0.875000 // sell
				if( Negative_Money_Flow > 4.95103e+06 )
					if( ad <= 2.44311e+07 )
						if( Typical_Price <= 0.638484 )
							if( Negative_Money_Flow_Sum <= 3.63803e+07 )
								if( Raw_Money_Flow <= 8.19228e+06 )
									ret := -0.327273
								if( Raw_Money_Flow > 8.19228e+06 )
									ret := -0.928571 // sell
							if( Negative_Money_Flow_Sum > 3.63803e+07 )
								if( MFI_Low <= 27.2125 )
									ret := 0.273224
								if( MFI_Low > 27.2125 )
									ret := -0.149171
						if( Typical_Price > 0.638484 )
							if( Negative_Money_Flow_Sum <= 9.82744e+07 )
								if( Positive_Money_Flow_Sum <= 6.70407e+07 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 6.70407e+07 )
									ret := 0.900000 // buy
							if( Negative_Money_Flow_Sum > 9.82744e+07 )
								if( Positive_Money_Flow_Sum <= 1.00154e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.00154e+08 )
									ret := -0.750000 // sell
					if( ad > 2.44311e+07 )
						if( ad_mf <= 4.37559e+07 )
							ret := 1.000000 // buy
						if( ad_mf > 4.37559e+07 )
							ret := 0.250000
	if( MFI_Low > 35.2618 )
		if( Positive_Money_Flow <= 911.05 )
			if( Negative_Money_Flow_Sum <= 4.28776e+06 )
				if( mf <= 0.035646 )
					if( Raw_Money_Flow <= 167959 )
						if( Positive_Money_Flow_Sum <= 4.8984e+06 )
							if( Negative_Money_Flow <= 63974.3 )
								if( Typical_Price <= 0.075595 )
									ret := 0.290909
								if( Typical_Price > 0.075595 )
									ret := -0.098344
							if( Negative_Money_Flow > 63974.3 )
								if( Typical_Price <= 0.185 )
									ret := 0.055039
								if( Typical_Price > 0.185 )
									ret := -0.313953
						if( Positive_Money_Flow_Sum > 4.8984e+06 )
							ret := -0.888889 // sell
					if( Raw_Money_Flow > 167959 )
						if( mf <= -0.083304 )
							if( MFI_Low <= 36.8772 )
								if( Positive_Money_Flow_Sum <= 3.74763e+06 )
									ret := -0.517241
								if( Positive_Money_Flow_Sum > 3.74763e+06 )
									ret := 0.235294
							if( MFI_Low > 36.8772 )
								if( MFI <= 82.2275 )
									ret := 0.092199
								if( MFI > 82.2275 )
									ret := -0.687500
						if( mf > -0.083304 )
							if( ad_mf <= -2.49918e+06 )
								if( Negative_Money_Flow <= 413677 )
									ret := 0.697674
								if( Negative_Money_Flow > 413677 )
									ret := 0.053333
							if( ad_mf > -2.49918e+06 )
								if( Positive_Money_Flow_Sum <= 3.55325e+06 )
									ret := -0.118211
								if( Positive_Money_Flow_Sum > 3.55325e+06 )
									ret := -0.380062
				if( mf > 0.035646 )
					if( MFI <= 83.829 )
						if( Positive_Money_Flow_Sum <= 203257 )
							if( Negative_Money_Flow_Sum <= 102017 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 102017 )
								if( Negative_Money_Flow_Sum <= 119426 )
									ret := -0.960000 // sell
								if( Negative_Money_Flow_Sum > 119426 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 203257 )
							if( Negative_Money_Flow_Sum <= 1.70631e+06 )
								if( Positive_Money_Flow_Sum <= 1.7674e+06 )
									ret := 0.020219
								if( Positive_Money_Flow_Sum > 1.7674e+06 )
									ret := 0.147744
							if( Negative_Money_Flow_Sum > 1.70631e+06 )
								if( Positive_Money_Flow_Sum <= 5.83528e+06 )
									ret := -0.156322
								if( Positive_Money_Flow_Sum > 5.83528e+06 )
									ret := 0.180505
					if( MFI > 83.829 )
						if( Negative_Money_Flow_Sum <= 2.85441e+06 )
							if( ad_mf <= -1.49779e+06 )
								if( mf <= 0.193597 )
									ret := 1.000000 // buy
								if( mf > 0.193597 )
									ret := 0.533333
							if( ad_mf > -1.49779e+06 )
								if( Negative_Money_Flow <= 644916 )
									ret := 0.217391
								if( Negative_Money_Flow > 644916 )
									ret := -0.363636
						if( Negative_Money_Flow_Sum > 2.85441e+06 )
							ret := -0.454545
			if( Negative_Money_Flow_Sum > 4.28776e+06 )
				if( ad <= 2.01846e+06 )
					if( MFI <= 79.6183 )
						if( mf <= 0.247104 )
							if( Positive_Money_Flow_Sum <= 1.60328e+08 )
								if( Negative_Money_Flow_Sum <= 2.79817e+07 )
									ret := 0.192180
								if( Negative_Money_Flow_Sum > 2.79817e+07 )
									ret := 0.470250
							if( Positive_Money_Flow_Sum > 1.60328e+08 )
								if( Positive_Money_Flow_Sum <= 2.88588e+08 )
									ret := -0.391304
								if( Positive_Money_Flow_Sum > 2.88588e+08 )
									ret := -0.923077 // sell
						if( mf > 0.247104 )
							if( Money_Flow_Ratio <= 2.54418 )
								if( Raw_Money_Flow <= 1.27668e+06 )
									ret := 0.295455
								if( Raw_Money_Flow > 1.27668e+06 )
									ret := -0.704225 // sell
							if( Money_Flow_Ratio > 2.54418 )
								if( MFI <= 73.21 )
									ret := 0.833333 // buy
								if( MFI > 73.21 )
									ret := 0.057692
					if( MFI > 79.6183 )
						if( ad_mf <= -2.87136e+06 )
							if( Typical_Price <= 0.433685 )
								if( Positive_Money_Flow_Sum <= 2.85065e+07 )
									ret := 0.625000
								if( Positive_Money_Flow_Sum > 2.85065e+07 )
									ret := -0.285714
							if( Typical_Price > 0.433685 )
								ret := 0.888889 // buy
						if( ad_mf > -2.87136e+06 )
							if( Raw_Money_Flow <= 2.68639e+06 )
								if( ad <= -925496 )
									ret := -1.000000 // sell
								if( ad > -925496 )
									ret := -0.769231 // sell
							if( Raw_Money_Flow > 2.68639e+06 )
								ret := -0.538462
				if( ad > 2.01846e+06 )
					if( ad_mf <= 1.71539e+07 )
						if( MFI_High <= -21.2388 )
							if( mf <= 0.115322 )
								if( mf <= -0.016461 )
									ret := -0.090909
								if( mf > -0.016461 )
									ret := -0.788462 // sell
							if( mf > 0.115322 )
								ret := -0.166667
						if( MFI_High > -21.2388 )
							if( Negative_Money_Flow <= 6.18337e+06 )
								if( Positive_Money_Flow_Sum <= 4.95024e+07 )
									ret := -0.190244
								if( Positive_Money_Flow_Sum > 4.95024e+07 )
									ret := 0.409091
							if( Negative_Money_Flow > 6.18337e+06 )
								if( Typical_Price <= 0.512047 )
									ret := -0.692308
								if( Typical_Price > 0.512047 )
									ret := 0.214286
					if( ad_mf > 1.71539e+07 )
						ret := 0.894737 // buy
		if( Positive_Money_Flow > 911.05 )
			if( MFI_High <= 18.219 )
				if( Raw_Money_Flow <= 3.8459e+06 )
					if( Negative_Money_Flow_Sum <= 1.40054e+07 )
						if( Positive_Money_Flow_Sum <= 707157 )
							if( Negative_Money_Flow_Sum <= 466290 )
								if( ad_mf <= -191721 )
									ret := -0.163539
								if( ad_mf > -191721 )
									ret := 0.062411
							if( Negative_Money_Flow_Sum > 466290 )
								if( MFI_High <= -21.4469 )
									ret := 0.222222
								if( MFI_High > -21.4469 )
									ret := 0.789474 // buy
						if( Positive_Money_Flow_Sum > 707157 )
							if( ad <= 1.65122e+07 )
								if( mf <= 0.27948 )
									ret := -0.098901
								if( mf > 0.27948 )
									ret := 0.057413
							if( ad > 1.65122e+07 )
								if( MFI_Low <= 42.6005 )
									ret := 0.900000 // buy
								if( MFI_Low > 42.6005 )
									ret := 0.410256
					if( Negative_Money_Flow_Sum > 1.40054e+07 )
						if( MFI_Low <= 42.4357 )
							if( ad_mf <= 1.08969e+06 )
								if( Money_Flow_Ratio <= 1.49771 )
									ret := 0.125984
								if( Money_Flow_Ratio > 1.49771 )
									ret := -0.676190
							if( ad_mf > 1.08969e+06 )
								if( MFI <= 60.2897 )
									ret := 0.313433
								if( MFI > 60.2897 )
									ret := -0.147541
						if( MFI_Low > 42.4357 )
							if( mf <= 0.034335 )
								if( Negative_Money_Flow_Sum <= 2.37982e+07 )
									ret := -0.318841
								if( Negative_Money_Flow_Sum > 2.37982e+07 )
									ret := 0.666667
							if( mf > 0.034335 )
								if( Money_Flow_Ratio <= 2.00004 )
									ret := 0.767442 // buy
								if( Money_Flow_Ratio > 2.00004 )
									ret := 0.007246
				if( Raw_Money_Flow > 3.8459e+06 )
					if( Positive_Money_Flow_Sum <= 2.62631e+07 )
						if( MFI_Low <= 36.7583 )
							ret := 0.136364
						if( MFI_Low > 36.7583 )
							if( ad <= -4.57609e+06 )
								if( Typical_Price <= 0.26592 )
									ret := -0.923077 // sell
								if( Typical_Price > 0.26592 )
									ret := 0.277778
							if( ad > -4.57609e+06 )
								if( Positive_Money_Flow <= 4.03325e+06 )
									ret := -0.454545
								if( Positive_Money_Flow > 4.03325e+06 )
									ret := -0.751055 // sell
					if( Positive_Money_Flow_Sum > 2.62631e+07 )
						if( mf <= 0.284981 )
							if( Typical_Price <= 0.439343 )
								if( Positive_Money_Flow_Sum <= 3.85139e+07 )
									ret := 0.133028
								if( Positive_Money_Flow_Sum > 3.85139e+07 )
									ret := -0.468401
							if( Typical_Price > 0.439343 )
								if( MFI <= 64.6339 )
									ret := -0.157407
								if( MFI > 64.6339 )
									ret := 0.155589
						if( mf > 0.284981 )
							if( Raw_Money_Flow <= 1.32361e+07 )
								if( Raw_Money_Flow <= 5.49741e+06 )
									ret := 0.238095
								if( Raw_Money_Flow > 5.49741e+06 )
									ret := -0.428571
							if( Raw_Money_Flow > 1.32361e+07 )
								if( ad <= 2.7569e+07 )
									ret := -1.000000 // sell
								if( ad > 2.7569e+07 )
									ret := -0.900000 // sell
			if( MFI_High > 18.219 )
				ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_XLMUSDT_30Min_76e473cb(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


